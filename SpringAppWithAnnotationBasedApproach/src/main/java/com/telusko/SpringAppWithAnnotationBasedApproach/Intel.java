package com.telusko.SpringAppWithAnnotationBasedApproach;

import org.springframework.stereotype.Component;

@Component
public class Intel implements MobileProcessor {

	public void process() {
		System.out.println("Another CPU manufactured by Intel");
	}

}
