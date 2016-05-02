package com.test.springcore;


/**
 * @author 
 * 
 * This class is a implementation of IHotDrink Interface
 *
 */
public class Tea implements IHotDrink{

	@Override
	public void prepareHotDrink() {

		System.out.println("Dear customer, we are preparing tea for you!!");
	}
	
}
