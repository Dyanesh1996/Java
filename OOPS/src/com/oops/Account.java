//code is similar to bankAccount.java...we've just introduced constructors here

package com.oops;

public class Account {
	
		private long accountNumber;
		private double balance;
		private String customerName;
		private String email;
		private long phoneNumber;
		
		//We're gonna create constructors here.
		
		public Account() {
			System.out.println("Empty constructors called");	
		}
		
		
		//we've removed getters and setters here to make use of constructors...
		public Account(long accountNumber, double balance, String customerName, String email, long phoneNumber ) {//parameterized constructor
			this.accountNumber = accountNumber;
			this.balance = balance;
			this.customerName = customerName;
			this.email = email;
			this.phoneNumber= phoneNumber;
		}
		

	public static void main(String[] args) {
		
			Account ba = new Account(12345678, 1234, "Tom", "Tom@gmail.com", 987654321);
					
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
