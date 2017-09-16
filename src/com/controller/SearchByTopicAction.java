package com.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.dao.impl.AfficheDAOImpl;
import com.po.Affiche;
import com.service.AfficheService;

public class SearchByTopicAction {

	public String searchByTopic() throws Exception{
		HttpServletRequest request = ServletActionContext.getRequest();
		String txt_keyword = request.getParameter("txt_keyword");
		AfficheService afficheService= new AfficheService();
		afficheService.setAfficheDAO(new AfficheDAOImpl());
	
		String sql ="Select *From affiche where a_topic like '%"+txt_keyword+"%' ";
		System.out.println(sql);
		List<Affiche> afficheList =afficheService.afficheList(sql);
		request.setAttribute("afficheList", afficheList);
	
		return "searchByTopic";
	}
	
	public String searchByTopicD() throws Exception{
		HttpServletRequest request = ServletActionContext.getRequest();
		String txt_keyword = request.getParameter("txt_keyword");
		AfficheService afficheService= new AfficheService();
		afficheService.setAfficheDAO(new AfficheDAOImpl());
	
		String sql ="Select *From affiche where a_topic like '%"+txt_keyword+"%' ";
		System.out.println(sql);
		List<Affiche> afficheList =afficheService.afficheList(sql);
		request.setAttribute("afficheList", afficheList);
	
		return "searchByTopicD";
	}
	
	public String searchByTopicU() throws Exception{
		HttpServletRequest request = ServletActionContext.getRequest();
		String txt_keyword = request.getParameter("txt_keyword");
		AfficheService afficheService= new AfficheService();
		afficheService.setAfficheDAO(new AfficheDAOImpl());
	
		String sql ="Select *From affiche where a_topic like '%"+txt_keyword+"%' ";
		System.out.println(sql);
		List<Affiche> afficheList =afficheService.afficheList(sql);
		request.setAttribute("afficheList", afficheList);
	
		return "searchByTopicU";
	}
}
