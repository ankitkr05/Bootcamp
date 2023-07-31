package Bootcamp.Day6.Debugging;

public class AccountTest {

	public static void main(String[] args) {
		
		Account account = new Account();
		
		account.getBalance();
		account.setId(1);
		account.setName("Pratyush");
		account.setBalance(39000);
		account.getBalance();

	}

}
