package com.epam.design.patterns.singleton;

public class Demo {
	
	public static void main(String[] args) throws InterruptedException {
		for(int i = 0; i < 10; i ++) {
			SingleObject signleObject = SingleObject.getInstance();
			signleObject.showMessage();
			Thread.sleep(2000);
		}
	}

}