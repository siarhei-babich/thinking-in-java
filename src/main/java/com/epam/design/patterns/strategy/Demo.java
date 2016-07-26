package com.epam.design.patterns.strategy;

public class Demo {
	
	public static void main(String[] args) {
		Context context = new Context(new AddStrategy());
		System.out.println("AddStrategy result: " + context.executeStrategy(10, 5));
		
		context = new Context(new MultiplyStrategy());
		System.out.println("MultiplyStrategy result: " + context.executeStrategy(10, 5));
	}

}