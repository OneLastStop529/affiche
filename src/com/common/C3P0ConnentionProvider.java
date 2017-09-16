package com.common;
import java.io.File;
import java.io.FileInputStream;  
import java.sql.Connection;  
import java.sql.SQLException;  
import java.util.Properties;  
import javax.sql.DataSource;
import com.mchange.v2.c3p0.DataSources;
public class C3P0ConnentionProvider {
	    private static final String JDBC_DRIVER = "driverClass";  
	    private static final String JDBC_URL = "jdbcUrl";	      
	    private static DataSource ds;  
	    /** 
	     * ��ʼ�����ӳش���� 
	     */  
	    static{  
	        initDBSource();  
	    }  
	      
	    /** 
	     * ��ʼ��c3p0���ӳ� 
	     */  
	    private static final void initDBSource(){  
	        Properties c3p0Pro = new Properties();  
	        try {  
	            //���������ļ�  
	    		String filepath = System.getProperty("user.dir")+File.separator+"/c3p0.properties";
	            c3p0Pro.load(new FileInputStream(filepath));  
	        } catch (Exception e) {  
	            e.printStackTrace();  
	        }   
	          
	        String drverClass = c3p0Pro.getProperty(JDBC_DRIVER);  
	        if(drverClass != null){  
	            try {  
	                //����������  
	                Class.forName(drverClass);  
	            } catch (ClassNotFoundException e) {  
	                e.printStackTrace();  
	            }  
	              
	        }  
	          
	        Properties jdbcpropes = new Properties();  
	        Properties c3propes = new Properties();  
	        for(Object key:c3p0Pro.keySet()){  
	            String skey = (String)key;  
	            if(skey.startsWith("c3p0.")){  
	                c3propes.put(skey, c3p0Pro.getProperty(skey));  
	            }else{  
	                jdbcpropes.put(skey, c3p0Pro.getProperty(skey));  
	            }  
	        }  
	          
	        try {  
	            //�������ӳ�  
	            DataSource unPooled = DataSources.unpooledDataSource(c3p0Pro.getProperty(JDBC_URL),jdbcpropes);  
	            ds = DataSources.pooledDataSource(unPooled,c3propes);  
	              
	        } catch (SQLException e) {  
	            e.printStackTrace();  
	        }  
	    }  
	      
	    /** 
	     * ��ȡ���ݿ����Ӷ��� 
	     * @return �������Ӷ��� 
	     * @throws SQLException  
	     */  
	    public static synchronized Connection getConnection() throws SQLException{  
	        final Connection conn = ds.getConnection();  
	        conn.setTransactionIsolation(Connection.TRANSACTION_READ_COMMITTED);  
	        return conn;  
	    }  
}
