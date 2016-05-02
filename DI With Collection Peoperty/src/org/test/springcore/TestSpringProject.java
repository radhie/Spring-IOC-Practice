package org.test.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * @author 
 * 
 * At runtime this class when it requests spring framework to get restaurantBean, it simply checks
 * for the property restaruantWaitersList in configuration file which is also present in the 
 * Restaurant class and then sets the values of list property and it displays  waiters list by
 * calling displayWaitersNames method
 *
 */
public class TestSpringProject {

	public static void main(String[] args) {
		
		ApplicationContext context =
				new ClassPathXmlApplicationContext("SpringConfig.xml");
		
		Restaurant restaurantObj = (Restaurant) context.getBean("restaurantBean");
		restaurantObj.displayWaitersNames();
	}

}