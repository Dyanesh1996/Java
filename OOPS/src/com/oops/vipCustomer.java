package com.oops;

public class vipCustomer {
	
		private String name;
		private double creditLimit;
		private String email;
		
		public vipCustomer() {
			this("Default_name", 50000, "default@gmail.com");
			
		}
		
		public vipCustomer(String name, double creditLimit) {
			this(name, creditLimit, "unknown@gmail.com");
			
		}
	
		public vipCustomer(String name, double creditLimit, String email) {
			this.name = name;
			this.creditLimit = creditLimit;
			this.email = email;
		}
		
	
		public String getName() {
			return name;
		}

		public double getCreditLimit() {
			return creditLimit;
		}

		public String getEmail() {
			return email;
		}

	

	public static void main(String[] args) {
		
		vipCustomer vc = new vipCustomer();
		System.out.println(vc.getName());
		
		vipCustomer vc2 = new vipCustomer("Dnyanesh", 100000000);
		System.out.println(vc2.getName() +  vc.getCreditLimit());
		
		vipCustomer vc3 =  new vipCustomer("Jerry", 54321, "Jerry@gmail.com");
		System.out.println(vc3.getName() + vc3.getEmail());

	}

}
