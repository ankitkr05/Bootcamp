package Bootcamp.Day4.OOPS;

class Account {
	
	int accountId;
	String accountHolderName;
	double balance;
	
	Account(int accountId, String accountHolderName, double balance) {
		
		this.accountId = accountId;
		this.accountHolderName = accountHolderName;
		this.balance = balance;
	}
	
	void displayAccountDetails() {
		
		System.out.println("account id: " + accountId);
		System.out.println("accountholder name: " + accountHolderName);
		System.out.println("balance: " + balance);
	}
	
	void withdraw(double amt) {
		
		balance -= amt;
		System.out.println("Updated Balance: " + balance);
		
	}
	
	void deposit(double amt) {
		
		balance += amt;
		System.out.println("Updated Balance: " + balance);
		
	}
	
	void getBalance() {
		
		System.out.println("Available Balance: " + balance);
	}

}
public class AccountApp {

	public static void main(String[] args) {
		
		Account account = new Account(1420, "Steve", 80000);
		account.displayAccountDetails();
		account.withdraw(20000);
		account.deposit(10000);
		account.getBalance();
		
	}
	
	
}
