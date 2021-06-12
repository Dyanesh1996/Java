package com.Udemy.Interfaces;

public class MobilePhone implements ITelephone {
	private int myNumber;
	private boolean isRinging;
	private boolean isOn = false;;
	
	public MobilePhone(int myNumber, boolean isRinging) {
		super();
		this.myNumber = myNumber;
		this.isRinging = isRinging;
	}
	@Override
	public void powerOn() {
		isOn = true;
		System.out.println("Mobile phone powered up");
		
	}
	@Override
	public void dial(int phoneNumber) {
		if(isOn) {
			System.out.println("Now ringing " + phoneNumber + " on MobilePhone");
		}else {
			System.out.println("Phone is switched off");
		}
		
	} 
	@Override
	public void answer() {
		if(isRinging) {
			System.out.println("Answering the MobilePhone");
			isRinging = false;
		}
		
	}
	@Override
	public boolean isPhoneRiniging() {
		return isRinging;
	}
}	