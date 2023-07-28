package Bootcamp.Day5.app;

import Bootcamp.Day5.service.BookingService;

public class MainApp {

	public static void main(String[] args) {
		
		BookingService bookingService = new BookingService();
		bookingService.bookTicket();

	}

}
