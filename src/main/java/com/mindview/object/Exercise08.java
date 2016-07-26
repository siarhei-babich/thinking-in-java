package com.mindview.object;

public class Exercise08 {

	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		StaticTest st1 = new StaticTest();
		StaticTest st2 = new StaticTest();
		StaticTest st3 = new StaticTest();
		System.out.println(StaticTest.i);
		System.out.println(st1.i);
		System.out.println(st2.i);
		Incrementable.increment();
		System.out.println("Incremented!");
		System.out.println(StaticTest.i);
		System.out.println(st3.i);
	}

}
