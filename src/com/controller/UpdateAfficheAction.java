package com.controller;

import com.dao.impl.AfficheDAOImpl;
import com.po.Affiche;
import com.service.AfficheService;

public class UpdateAfficheAction {
	private Affiche affiche;
public Affiche getAffiche() {
		return affiche;
	}
	public void setAffiche(Affiche affiche) {
		this.affiche = affiche;
	}
public String updateAffiche() throws Exception{
	
	String sql="UPDATE  affiche SET a_topic='"+affiche.getA_topic()+"',a_content='"+affiche.getA_content()+"' WHERE a_id='"+affiche.getA_id()+"'";
	AfficheService afficheService= new AfficheService();
	afficheService.setAfficheDAO(new AfficheDAOImpl());
	int i = afficheService.updateAffiche(sql);
	System.out.println(sql);
	if(i==1){
		System.out.println("===修改成功===");
	}else
	{
		System.out.println("===修改失败===");
	}
	return "updateAffiche";
	
	
}

}
