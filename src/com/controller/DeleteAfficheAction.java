package com.controller;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.dao.impl.AfficheDAOImpl;
import com.service.AfficheService;

public class DeleteAfficheAction {

	public String deleteAffiche() throws Exception{
		HttpServletRequest request = ServletActionContext.getRequest();
		AfficheService afficheService= new AfficheService();
		afficheService.setAfficheDAO(new AfficheDAOImpl());
		String a_id = request.getParameter("a_id");
		String sql="delete from affiche where a_id='"+a_id+"'";
		int i= afficheService.deleteAffiche(sql);
		if( i == 1 ){
			System.out.println("===É¾³ý³É¹¦===");
		}else{
			System.out.println("===É¾³ýÊ§°Ü===");
			
		}
		return "deleteAffiche";
		
	}

}
