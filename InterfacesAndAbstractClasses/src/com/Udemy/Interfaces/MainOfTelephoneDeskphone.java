package com.Udemy.Interfaces;

public class MainOfTelephoneDeskphone {

	public static void main(String[] args) {
		ITelephone dnyaneshPhone;
		dnyaneshPhone = new DeskPhone(1234, false);
		dnyaneshPhone.dial(956176);
		
		dnyaneshPhone = new MobilePhone(9090, true);
		dnyaneshPhone.dial(12345);
	}

}
