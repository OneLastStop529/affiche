package com.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.dao.impl.AfficheDAOImpl;
import com.po.Affiche;
import com.service.AfficheService;

public class AfficheListAction {

	public String afficheList()throws Exception{
		HttpServletRequest request = ServletActionContext.getRequest();
		AfficheService afficheService= new AfficheService();
		afficheService.setAfficheDAO(new AfficheDAOImpl());
	
		String sql ="Select *From affiche";
		List<Affiche> afficheList =afficheService.afficheList(sql);
		request.setAttribute("afficheList", afficheList);
		return "afficheList";
	}
}
