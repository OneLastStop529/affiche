package com.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.dao.impl.AfficheDAOImpl;
import com.po.Affiche;
import com.service.AfficheService;

public class SaveAfficheAction {
private Affiche affiche;


public Affiche getAffiche() {
	return affiche;
}

public void setAffiche(Affiche affiche) {
	this.affiche = affiche;
}

public String saveAffiche() throws Exception{
	SimpleDateFormat sf =new SimpleDateFormat("yyyyMMddhhmmss");
	String a_id="Hugo"+sf.format(new Date());
	affiche.setA_id(a_id);
	String a_admin ="Hugo";
	System.out.println("�������⣺"+affiche.getA_topic());
	System.out.println("�������ݣ�"+affiche.getA_content());
	String sql="Insert into affiche values('"+affiche.getA_id()+"','"+affiche.getA_topic()+"','"+affiche.getA_content()+"','"+affiche.getA_admin()+"')";
	AfficheService afficheService= new AfficheService();
	afficheService.setAfficheDAO(new AfficheDAOImpl());
	int i = afficheService.saveAffiche(sql);
	if( i == 1 ){
		System.out.println("===�����ɹ�===");
	}else{
		System.out.println("===����ʧ��===");
		
	}
	return "saveAffiche";
}

}
