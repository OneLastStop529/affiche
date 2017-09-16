package com.service;

import java.util.List;

import com.dao.AfficheDAO;
import com.po.Affiche;

public class AfficheService {

	private AfficheDAO afficheDAO;
	
	public void setAfficheDAO(AfficheDAO afficheDAO){
		this.afficheDAO =afficheDAO;
	}

	public int saveAffiche(String sql)throws Exception{
		return afficheDAO.save(sql);
	}

	public int deleteAffiche(String sql)throws Exception{
		return afficheDAO.delete(sql);
	}

	public int updateAffiche(String sql)throws Exception{
	return afficheDAO.update(sql);
}
	
	public List<Affiche> afficheList(String sql)throws Exception{
		return afficheDAO.listAffiche(sql);
		
	}
	

	public void addBatchSQL(String sql) throws Exception {
		// TODO Auto-generated method stub
		afficheDAO.addBatchSQL(sql);
	}


	public int[] updateBatchSQL() throws Exception {
		// TODO Auto-generated method stub
		return afficheDAO.updateBatchSQL();
	}
	
	public long pageCount(int pageSize)throws Exception{
		
		return afficheDAO.pageCount(pageSize);
	}
	
}
