package com.Udemy.Interfaces;

public class DeskPhone implements ITelephone {
	private int myNumber;
	private boolean isRinging;
	
	public DeskPhone(int myNumber, boolean isRinging) {
		super();
		this.myNumber = myNumber;
		this.isRinging = isRinging;
	}
	@Override
	public void powerOn() {
		System.out.println("No action taken since DeskPhone has no power button");
		
	}
	@Override
	public void dial(int phoneNumber) {
		System.out.println("Now ringing " + phoneNumber + " on deskphone");
		
	}
	@Override
	public void answer() {
		if(isRinging) {
			System.out.println("Answering the deskphone");
			isRinging = false;
		}
		
	}
	@Override
	public boolean isPhoneRiniging() {
		return isRinging;
	}
	
	
	
}
