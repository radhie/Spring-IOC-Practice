package org.test.springcore;


/**
 * @author 
 * 
 * This class sets the value of welcomeNote property and also provides this value when requested
 * for Restaurant bean
 *
 */
public class Restaurant {

	private String welcomeNote;

	public void setWelcomeNote(String welcomeNote) {

		this.welcomeNote = welcomeNote;
	}

	public void greetCustomer() {

		System.out.println(welcomeNote);
	}
}