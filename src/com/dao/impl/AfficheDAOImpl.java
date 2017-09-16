package com.dao.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.common.DBUtils;
import com.dao.AfficheDAO;
import com.po.Affiche;

public class AfficheDAOImpl implements AfficheDAO{
		

	  


private static Connection conn;
private static Statement stm;

static {
	try {
			String db_host=DBUtils.getPropertiesValue("db_host");
		   String db_port=DBUtils.getPropertiesValue("db_port");
		   String db_user=DBUtils.getPropertiesValue("db_user");
		   String db_pwd=DBUtils.getPropertiesValue("db_pwd");
		String url="jdbc:mysql://"+db_host+":"+db_port+"/affiche?user="+db_user+"&password="+db_pwd;
		Class.forName("com.mysql.jdbc.Driver").newInstance();
		conn=DriverManager.getConnection(url);
		stm=conn.createStatement();
	} catch (Exception e) {
		e.printStackTrace();
	}
	
}


	@Override
	public int save(String sql) throws Exception {
		// TODO Auto-generated method stub
		return stm.executeUpdate(sql);
	}

	@Override
	public int delete(String sql) throws Exception {
		// TODO Auto-generated method stub
		return stm.executeUpdate(sql);
	}

	@Override
	public int update(String sql) throws Exception {
		// TODO Auto-generated method stub
		return stm.executeUpdate(sql);
	}

	@Override
	public List<Affiche> listAffiche(String sql) throws Exception {
		// TODO Auto-generated method stub
		
		List<Affiche> afficheList= new ArrayList<Affiche>();
		ResultSet rs = stm.executeQuery(sql);
		while(rs.next()){
			Affiche a = new Affiche();
			a.setA_id(rs.getString("a_id"));
			a.setA_topic(rs.getString("a_topic"));
			a.setA_content(rs.getString("a_content"));
			a.setA_admin(rs.getString("a_admin"));
			
			afficheList.add(a);
			
		}
		return afficheList;
	}

	@Override
	public void addBatchSQL(String sql) throws Exception {
		// TODO Auto-generated method stub
		stm.addBatch(sql);
	}

	@Override
	public int[] updateBatchSQL() throws Exception {
		// TODO Auto-generated method stub
		return stm.executeBatch();
	}

	@Override
	public long size() throws Exception {
		// TODO Auto-generated method stub
		String sql ="SELECT COUNT(a_id) AS count_rs FROM affiche";
		ResultSet rs = stm.executeQuery(sql);
		rs.first();
		String s = rs.getString("count_rs");
		long size = Long.parseLong(s);
		return size;
	}

	@Override
	public long pageCount(int pageSize) throws Exception {
		int pageCount=0;
		long size= size();
		if  (size%pageSize==0)
			pageCount =(int)size/pageSize;
		else
			pageCount =(int)size/pageSize+1;
		return pageCount;
	}



}
