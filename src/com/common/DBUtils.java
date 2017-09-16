package com.common;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.util.Properties;

import com.dao.impl.AfficheDAOImpl;

public class DBUtils {
   public static String getPropertiesValue(String k) throws FileNotFoundException, IOException{
	   
		//1、获取AfficheDaoImpl的类对象
		Class c=AfficheDAOImpl.class;
		//2、获取URL对象
		URL url=c.getResource("/");

		String path = url.getPath();		

		//3、获取文件的路径
		String filePath=path+File.separator+"conn.properties";

		//4、声明Properties对象
		Properties p=new Properties();
		p.load(new FileInputStream(new File(filePath)));
		String v=p.getProperty(k);

	   return v;
   }
   public static void main(String[] args) throws FileNotFoundException, IOException {
	   //System.out.println(DBUtils.getPropertiesValue("db_host"));
	   String db_host=DBUtils.getPropertiesValue("db_host");
	   String db_port=DBUtils.getPropertiesValue("db_port");
	   String db_user=DBUtils.getPropertiesValue("db_user");
	   String db_pwd=DBUtils.getPropertiesValue("db_pwd");

	   String url="jdbc:mysql://"+db_host+":"+db_port+"/affiche?user="+db_user+"&password="+db_pwd;
       
   }
   
   
}
