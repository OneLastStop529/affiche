package test;

import com.dao.impl.AfficheDAOImpl;
import com.service.AfficheService;


public class Test {

	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		AfficheService afficheService = new AfficheService();
		afficheService.setAfficheDAO(new AfficheDAOImpl());
		long pageCount = afficheService.pageCount(2);
		System.out.println(pageCount);
		
	}

}
