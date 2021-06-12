package com.oops;

public class simpleCalculator {
	
		private double firstNumber;
		private double secondNumber;
		
		
		public void setFirstNumber(double firstNumber) {
			this.firstNumber = firstNumber;
		}
		
		public double getFirstNumber() {
			return this.firstNumber;
		}
		
		
		
		public void setSecondNumber(double secondNumber) {
			this.secondNumber = secondNumber;
		}
		
		public double getSecondNumber() {
			return this.secondNumber;
		}
		
	
	
	
	
		

	public static void main(String[] args) {
		 
		simpleCalculator simcalc = new simpleCalculator();
		
		simcalc.setFirstNumber(10.5);
		simcalc.setSecondNumber(20.0);
		
		
		System.out.println("Add : " + simcalc.getAdditionResults());
		System.out.println("Subtract : " + simcalc.getSubtractionResults());
		System.out.println("Multiply : " + simcalc.getMultiplicationResults());
		System.out.println("Divide : " + simcalc.getDivisionResults());		
	}
	
	
	public double getAdditionResults() {
		
		return (this.firstNumber + this.secondNumber); 
		
	}
	
	public double getSubtractionResults() {
		
		return this.firstNumber - this.secondNumber; 
		
	}
	
	public double getMultiplicationResults() {
		
		return this.firstNumber * this.secondNumber; 
		
	}
	public double getDivisionResults() {
		
		return this.firstNumber / this.secondNumber; 
		
	}

}
