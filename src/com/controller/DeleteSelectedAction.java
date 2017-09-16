package com.controller;

import com.dao.impl.AfficheDAOImpl;
import com.service.AfficheService;

public class DeleteSelectedAction {
private String ck_boxes[];

public String[] getCk_boxes() {
	return ck_boxes;
}

public void setCk_boxes(String[] ck_boxes) {
	this.ck_boxes = ck_boxes;
}

public String deleteSelected()throws Exception{
	AfficheService afficheService= new AfficheService();
	afficheService.setAfficheDAO(new AfficheDAOImpl());
	
	String aid[]= getCk_boxes();
	String sql="";
	for(int i=0;i<aid.length;i++){
		sql="delete from affiche where a_id='"+aid[i].trim()+"'";
		afficheService.addBatchSQL(sql);
	}
		afficheService.updateBatchSQL();
	return "deleteSelected";
}

}
