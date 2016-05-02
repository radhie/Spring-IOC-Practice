package com.test.springcore;

/**
 * Spring bean
 * 
 * This class has hotDrink property and a setter method which is used by Spring framework
 * to set the value of Tea object at runtime
 * 
 */
public class Restaurant {

	IHotDrink hotDrink;
	
	public void setHotDrink(IHotDrink hotDrink) {
		this.hotDrink = hotDrink;
	}

	public void prepareHotDrink() {

		hotDrink.prepareHotDrink();
	}
}