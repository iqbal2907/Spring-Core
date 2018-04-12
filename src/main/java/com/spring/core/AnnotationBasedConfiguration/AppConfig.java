package com.spring.core.AnnotationBasedConfiguration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages="com.spring.core.AnnotationBasedConfiguration")
public class AppConfig {

	// by using @Component annotation in Samsung class we dont need following code ie create bean object 
	
/*	@Bean
	public Samsung getPhone(){
		return new Samsung();
	}
	
	@Bean
	public MobileProcessor getProcessor(){
		return new SnapDragon();
	}
*/

}
