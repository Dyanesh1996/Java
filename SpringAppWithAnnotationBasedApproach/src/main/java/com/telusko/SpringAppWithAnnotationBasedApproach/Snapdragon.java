package com.telusko.SpringAppWithAnnotationBasedApproach;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary			//Spring will pick Snapdragon over Intel although both implement MobileProcessor
public class Snapdragon implements MobileProcessor {
	
	public void process() {
		System.out.println("World class CPU");
	}

}
