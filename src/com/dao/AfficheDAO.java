package com.dao;

import java.util.List;

import com.po.Affiche;

public interface AfficheDAO {
//	新增公告
	public int save(String sql)throws Exception;
//	删除公告
	public int delete(String sql)throws Exception;
//	修改公告
	public int update(String sql)throws Exception;
//	增加公告
	public List<Affiche> listAffiche(String sql)throws Exception;
	
	public void addBatchSQL(String sql)throws Exception;
	
	public int[] updateBatchSQL()throws Exception;
	
	public long size()throws Exception;		
	
	public long pageCount(int pageSize)throws Exception;
}
