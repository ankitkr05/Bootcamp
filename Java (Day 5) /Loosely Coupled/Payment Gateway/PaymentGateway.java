package Bootcamp.Day5.pay;

import Bootcamp.Day5.Payment.Card;
import Bootcamp.Day5.Payment.Payment;
import Bootcamp.Day5.Payment.Netbanking;
import Bootcamp.Day5.Payment.UPI;

public class PaymentGateway {

	
	public PaymentGateway() {
		
		Payment payment = new Card();
		payment.pay();
		
	}
	

}
