package com.spring.core.AnnotationBasedConfiguration;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext applicationContextFactory = new AnnotationConfigApplicationContext(AppConfig.class); 
    	Samsung samsung = applicationContextFactory.getBean(Samsung.class);
    	samsung.config();
    }
}
