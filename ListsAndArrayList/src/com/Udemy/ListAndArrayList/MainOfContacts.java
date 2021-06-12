//Incomplete code...Need to revisit


package com.Udemy.ListAndArrayList;


import java.util.Scanner;

public class MainOfContacts {
	private static Scanner sc = new Scanner(System.in);
	private static MobilePhone mobilePhone = new MobilePhone("1234 5678 90");
	
	
	public static void main(String[] args) {
		boolean quit = false;
		startPhone();
		printActions();
		while(!quit) {
			System.out.println("Enter action");
			int action = sc.nextInt();
			sc.nextLine();	
			
			switch(action) {
			case 0 : 
				System.out.println("Shutting down");
				break;
				
			case 1 :
				mobilePhone.printContacts();
				break;				
			}
		}	
	}
	

	private static void startPhone() {
		System.out.println("Starting the phone...");
		
	}
	
	private static void printActions() {
		System.out.println("Available actions : press  ");
		System.out.println( "0 - Shutdown" +
							"1 - to print contacts" +
							"2 - to add new contact " +
							"3 - to update an existing contact " +
							"4 - to remove an existing contact " +
							"5 - query if an existing contact exists " + 
							"6 - print list of available options ");

		System.out.println("Choose your action");
							
	}

}
