package com.oops;

public class bankAccount {
	
		private long accountNumber;
		private double balance;
		private String customerName;
		private String email;
		private long phoneNumber;
		
		
		public void setAcoountNumber(long accountNumber) {
			this.accountNumber = accountNumber;
		}
		
		public long getAccountNumber() {
			return this.accountNumber;
		}
	
		
		public void setBalance(double balance) {
			this.balance = balance;
		}
	
		public double getBalance() {
			return this.balance;
		}
	

		
		public void setCustomerName(String customerName) {
			this.customerName = customerName;
		}
		
		public String getCustomerName() {
			return this.customerName;
		}
		
		
		public void setEmail(String email) {
			this.email = email;
		}
		
		public String getEmail() {
			return this.email;
		}
		
		
		public void setPhoneNumber(long phoneNumber) {
			this.phoneNumber = phoneNumber;
		}
		
		public long getPhoneNumber() {
			return this.phoneNumber;
		}
		
		
		
		
	public static void main(String[] args) {
		
			bankAccount ba = new bankAccount();
			
			ba.setAcoountNumber(1234567);
			ba.setBalance(1000000.00);
			ba.setCustomerName("Tom");
			ba.setEmail("tom@gmail.com");
			ba.setPhoneNumber(987654321);
			
			System.out.println("Hey " + ba.getCustomerName() + "Your account number is : " + ba.getAccountNumber() + " ,Your phone number is : " + ba.getPhoneNumber() + " while your email id is : " + ba.getEmail());
			System.out.println("Tom, your current balance is : " + ba.getBalance());
			
			ba.withdrawFunds(500.00);
			ba.depositFunds(900.50);
			
			
	}
	
		public void depositFunds(double depositAmount) {
			this.balance += depositAmount;
			System.out.println("Deposit of " + depositAmount + " processed successfully. Updated balance is : " + this.balance);
			
			
		}
		
		public void withdrawFunds(double withdrawAmount) {
			if(this.balance - withdrawAmount < 0) {
				System.out.println("Withdrawal cannot be processed as withdrawal amount is greater than current balance");
			}
			else {
				this.balance -= withdrawAmount;
				System.out.println("Withdrawal of " + withdrawAmount + " processed succesfully. Remaining balance is : " + this.balance);
			}
			
		}
}
