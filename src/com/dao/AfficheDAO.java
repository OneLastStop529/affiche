package com.dao;

import java.util.List;

import com.po.Affiche;

public interface AfficheDAO {
//	��������
	public int save(String sql)throws Exception;
//	ɾ������
	public int delete(String sql)throws Exception;
//	�޸Ĺ���
	public int update(String sql)throws Exception;
//	���ӹ���
	public List<Affiche> listAffiche(String sql)throws Exception;
	
	public void addBatchSQL(String sql)throws Exception;
	
	public int[] updateBatchSQL()throws Exception;
	
	public long size()throws Exception;		
	
	public long pageCount(int pageSize)throws Exception;
}
