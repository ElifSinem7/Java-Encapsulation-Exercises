package Exercise2;

public class BankAccount {
	private String accountNumber;
	private double balance;
	
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}

	public static void main(String[] args) {
		BankAccount account = new BankAccount();
		
		account.setAccountNumber("SB-09876");
		account.setBalance(3500.0);
		
		System.out.println("***** Account Information *****");
		System.out.println("Account Number: " + account.getAccountNumber() + "\nBalance: " + account.getBalance());

	}

}
