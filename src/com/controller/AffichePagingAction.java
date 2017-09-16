package com.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.dao.impl.AfficheDAOImpl;
import com.po.Affiche;
import com.service.AfficheService;

public class AffichePagingAction {

public String affichePaging() throws Exception{
	HttpServletRequest request = ServletActionContext.getRequest();
	AfficheService afficheService= new AfficheService();
	afficheService.setAfficheDAO(new AfficheDAOImpl());
	List<Affiche> afficheList = new ArrayList<Affiche>();
	int pageSize =2;
	String currPage = request.getParameter("currPage");
	if(currPage == null){
		currPage="1";
	}
	
	if(Integer.parseInt(currPage)<1){
		currPage="1";
	}
	int offset = (Integer.parseInt(currPage)-1)*pageSize;
	
	String sql ="Select *From affiche limit "+offset+","+pageSize;
	System.out.println(sql);
	afficheList =afficheService.afficheList(sql);
	request.setAttribute("afficheList", afficheList);
	request.setAttribute("currPage", currPage);
	return "affichePaging";
}

}
