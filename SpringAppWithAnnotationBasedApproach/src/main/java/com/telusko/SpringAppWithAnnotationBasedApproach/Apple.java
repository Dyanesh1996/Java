package com.telusko.SpringAppWithAnnotationBasedApproach;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class Apple {

	@Autowired
	MobileProcessor cpu;
	
	public MobileProcessor getCpu() {
		return cpu;
	}

	public void setCpu(MobileProcessor cpu) {
		this.cpu = cpu;
	}

	public void config() {
		System.out.println("Octa Core, 4GB RAM");
		cpu.process();
	}
}
