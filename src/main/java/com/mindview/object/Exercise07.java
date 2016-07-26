package com.mindview.object;

public class Exercise07 {

	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		Incrementable.increment();
		System.out.println(StaticTest.i);
		Incrementable sf = new Incrementable();
		sf.increment();
		System.out.println(StaticTest.i);
	}

}