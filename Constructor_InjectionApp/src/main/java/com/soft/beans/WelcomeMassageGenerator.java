package com.soft.beans;

import java.util.Date;

public class WelcomeMassageGenerator {

	private Date date;

	public void setDate(Date date) {
		this.date = date;
	}
	
	
	
	/**
	 * 
	 */
	public WelcomeMassageGenerator() {
		super();
		// TODO Auto-generated constructor stub
	}

	public WelcomeMassageGenerator(Date date) {
		super();
		this.date = date;
	}



	public String massageGenrator(String name) {

		int hours = 0;
		hours = date.getHours();

		if (hours <= 12) {
			return "Good Morning::" + name;
		} else if (hours <= 16) {
			return "Good Afternoon::" + name;
		} else if (hours <= 20) {
			return "Good Evening::" + name;
		} else {
			return "Good Night::" + name;
		}

	}
}
