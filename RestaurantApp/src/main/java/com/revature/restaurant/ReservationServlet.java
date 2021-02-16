package com.revature.restaurant;

import java.io.BufferedReader;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.revature.restaurant.dao.ReservationDao;
import com.revature.restaurant.service.ReservationService;

public class ReservationServlet extends HttpServlet{
	
	ReservationService service = new ReservationService(new ReservationDao());
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
		throws ServletException, IOException {
		
		BufferedReader reader = req.getReader();
		
		String line = "";
		
		while (line != null) {
			
			line = reader.readLine();
			System.out.println(line);
			
		}
		
		String firstName = req.getParameter("firstName");
		
		String lastName = req.getParameter("lastName");
		
		String date = req.getParameter("date");
		
		System.out.println(date);
		
		service.makeReservation(firstName, lastName, date);
		
	}

}
