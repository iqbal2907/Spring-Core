package com.spring.core.AnnotationBasedConfiguration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

//@Primary		//this annotation injects MediaTek object to @Autowired public MobileProcessor cpu; reference 
				//even if other implementation is present for MobileProcessor interface
@Component
public class MediaTek implements MobileProcessor {

	public void process() {

		System.out.println("Another best Mobile CPU MediaTek");
	}

}
