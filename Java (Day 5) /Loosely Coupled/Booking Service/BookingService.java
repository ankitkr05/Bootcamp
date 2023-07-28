package Bootcamp.Day5.service;

import Bootcamp.Day5.dao.DbConnect;
import Bootcamp.Day5.dao.MySql;
import Bootcamp.Day5.dao.Oracle;

public class BookingService {
	
	DbConnect dbConnect;
	
	public BookingService() {
		
		dbConnect = new Oracle();
		
	}
	
	public void bookTicket() {
		dbConnect.databaseProperty();
		System.out.println("Ticket booking logic");
	}
	

}
