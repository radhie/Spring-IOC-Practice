package org.test.springcore;

import java.util.List;


/**
 * @author 
 * 
 * This class sets and displays restaruantWaitersList
 *
 */
public class Restaurant {

	private List restaruantWaitersList;

	public void setRestaruantWaitersList(List restaruantWaitersList) {
		this.restaruantWaitersList = restaruantWaitersList;
	}

	public void displayWaitersNames() {

		System.out.println("All waiters working in Restaruant  :  " + restaruantWaitersList);
	}

}