package com.test.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * @author 
 * 
 * TestSpringProject is a test class which reads the bean definitions from SpringConfig.xml 
 * and when requested for restaurantBean it first creates teaBean object and then injects this 
 * object into Restaurant class constructor.
 */
public class TestSpringProject {
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("SpringConfig.xml");
 
		Restaurant restaurantObj = (Restaurant) context.getBean("restaurantBean");
		restaurantObj.prepareHotDrink();
	}
}