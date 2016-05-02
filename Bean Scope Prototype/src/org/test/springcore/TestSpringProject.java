package org.test.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * @author 
 * 
 * This class checks the bean scope in configuration file.If the scope is prototype then spring
 * creates a new bean object whenever it is needed.That means this class creates two objects for
 * both restaurantBean class and each object displays its own value of WelcomeNote property through 
 * getBean method
 *
 */
public class TestSpringProject {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("SpringConfig.xml");

		Restaurant restaruantObj1 = (Restaurant) context.getBean("restaurantBean");
		restaruantObj1.setWelcomeNote("Object1 is setting welcome note properrty");
		restaruantObj1.greetCustomer();

		Restaurant restaurantObj = (Restaurant) context.getBean("restaurantBean");
		restaurantObj.greetCustomer();

	}
}