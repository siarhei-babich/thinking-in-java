package com.epam.design.patterns.singleton;

import java.util.Date;

public class SingleObject {
	
	private static SingleObject instance = new SingleObject();
	
	private String date = new Date().toString(); 
	
	private SingleObject() {};
	
	public static SingleObject getInstance() {
		return instance;
	}
	
	public void showMessage() {
		System.out.println("Hello World! " + date);
	}

}