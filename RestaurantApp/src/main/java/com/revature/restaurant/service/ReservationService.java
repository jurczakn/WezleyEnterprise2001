package com.revature.restaurant.service;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import com.revature.restaurant.dao.ReservationDao;
import com.revature.restaurant.pojo.Reservation;

public class ReservationService {
	
	private ReservationDao dao;
	
	public ReservationService(ReservationDao dao) {
		super();
		this.dao = dao;
	}



	public void makeReservation(String firstName, String lastName, String date) {
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy:hh-mm");
		
		System.out.println(formatter);
		
		LocalDateTime localDateTime = LocalDateTime.parse(date, formatter);
		
		Reservation reservation = new Reservation(firstName, lastName, localDateTime);

		dao.createReservation(reservation);
		
	}

}
