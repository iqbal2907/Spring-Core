package com.spring.core.AnnotationBasedConfiguration;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

//default id will be snapdragon ie non qualified and de captilized name (It search for by type)
@Component
public class SnapDragon implements MobileProcessor {

	public void process() {
		System.out.println("Worlds best CPU SnapDragon");
	}

}
