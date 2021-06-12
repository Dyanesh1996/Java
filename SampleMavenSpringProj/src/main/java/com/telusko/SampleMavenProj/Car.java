package com.telusko.SampleMavenProj;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car implements Vehicle{

	@Autowired
	private Tyre tyre;			//Create this to understand @Autowired annotation
								/*Tyre is a property for Car class,,Hence let's write that over in property tag of spring.xml
								But to avoid that, we can use @Autowired annotation*/
	
	public Tyre getTyre() {
		return tyre;
	}
	
	public void setTyre(Tyre tyre) {
		this.tyre = tyre;
	}



	public void drive() {
		System.out.println("Chal rahi hai bhai teri gaddi" + tyre + " ke saath");
	}
}
