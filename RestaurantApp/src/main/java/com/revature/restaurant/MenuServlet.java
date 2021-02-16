package com.revature.restaurant;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.revature.restaurant.dao.MenuItemDao;
import com.revature.restaurant.service.MenuItemService;

public class MenuServlet extends HttpServlet {
	
	private MenuItemService menuItemService = 
			new MenuItemService(new MenuItemDao());
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
		throws ServletException, IOException {
		
		String results = "";
		
		results = menuItemService.getAllMenuItems().toString();
		
		PrintWriter writer = resp.getWriter();
		writer.write(results);
		
	}

}
