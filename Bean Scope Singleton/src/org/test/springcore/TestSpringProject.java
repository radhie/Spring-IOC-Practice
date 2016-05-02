package org.test.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * @author 
 * 
 * This class checks the bean scope in configuration file.If the scope is singleton then spring
 * creates a only one bean object and provides same object whenever it is needed.
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