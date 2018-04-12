package com.spring.core.AnnotationBasedConfiguration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component  //By default we will get MobileProcessor object in cpu reference Also default id will be samsung
public class Samsung {
	
	@Autowired
	@Qualifier("mediatek") //through this annotation we can inject specified bean to cup ref since two diff impl of MobileProcessor is present
	public MobileProcessor cpu;

	public MobileProcessor getCpu() {
		return cpu;
	}

	public void setCpu(MobileProcessor cpu) {
		this.cpu = cpu;
	}

	public void config(){
		System.out.println("Octa core, 4 gb Ram, 16 MP camera");
		cpu.process();
	}
}
