package com.oops;

public class person {

	String firstName;
	String lastName;
	int age;
	
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getFirstName() {
		return this.getFirstName();
	}
	
	
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getLastName() {
		return this.getLastName();
	}
	
	
	
	public void setAge(int age) {
		if(age > 0) {
			this.age = age;
		}
	}
	
	public int getAge() {
		return this.getAge();
	}
	

	public static void main(String[] args) {
		
		person personn = new person();
		
		
		// type 1
		personn.setFirstName("Dnyanesh");
		personn.setLastName("Tathode");
		personn.setAge(24);
		System.out.println("fullName is : " + personn.getFullName());
		System.out.println("Teen is : " + personn.isTeen());
		
		
		//type 2
		personn.setFirstName("Dnyanesh");
		personn.setLastName("");
		personn.setAge(11);
		System.out.println("fullName is : " + personn.getFullName());
		System.out.println("Teen is : " + personn.isTeen());
		
		
		//type 3
		personn.setFirstName("");
		personn.setLastName("Tathode");
		personn.setAge(10);
		System.out.println("fullName is : " + personn.getFullName());
		System.out.println("Teen is : " + personn.isTeen());
		
		

		//type 3
		personn.setFirstName("");
		personn.setLastName("");
		personn.setAge(19);
		System.out.println("fullName is : " + personn.getFullName());
		System.out.println("Teen is : " + personn.isTeen());
	}
	
	
	
	public boolean isTeen(){
		
		if(age > 12 && age < 20) {
			return true;
		}
		else
			return false;
	}
	
	
	public String getFullName() {
		if(firstName.isEmpty() == true && lastName.isEmpty() == true){	// or //"".equals(this.firstName) && "".equals(this.lastName)) 
			return null;
		}
		else if(firstName.isEmpty()) {
			return getLastName();		
		} 
		else if (lastName.isEmpty()){
			return getFirstName();
		}
		else 
			return firstName + lastName;
	}
}
