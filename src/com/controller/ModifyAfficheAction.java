package com.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.dao.impl.AfficheDAOImpl;
import com.po.Affiche;
import com.service.AfficheService;

public class ModifyAfficheAction {



public String modifyAffiche() throws Exception{
	
	HttpServletRequest request = ServletActionContext.getRequest();
	AfficheService afficheService= new AfficheService();
	afficheService.setAfficheDAO(new AfficheDAOImpl());
	String a_id = request.getParameter("a_id");
	String sql ="Select * from affiche where a_id='"+a_id+"'";
	List<Affiche> afficheList = afficheService.afficheList(sql);
	
	request.setAttribute("afficheList", afficheList);
	
	return "modifyAffiche";
}

}
