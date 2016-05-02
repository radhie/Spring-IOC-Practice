package com.test.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
 

/**
 * @author 
 * 
 * Test class sets the value of iHotDrink through setter method when requested for restaurantBean 
 *
 */
public class TestSpringProject {
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("SpringConfig.xml");
 
		Restaurant restaurantObj = (Restaurant) context.getBean("restaurantBean");
		restaurantObj.prepareHotDrink();
	}
}