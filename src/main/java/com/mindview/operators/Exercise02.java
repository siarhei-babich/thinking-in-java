package com.mindview.operators;

public class Exercise02 {

	public static void main(String args[]) {

		Tank t1 = new Tank();
		Tank t2 = new Tank();

		t1.volume = 1;
		t2.volume = 2;

		System.out.println("1) t1 = " + t1.volume);
		System.out.println("1) t2 = " + t2.volume);

		t1 = t2;

		System.out.println("2) t1 = " + t1.volume);
		System.out.println("2) t2 = " + t2.volume);

		t1.volume = 3;

		System.out.println("3) t1 = " + t1.volume);
		System.out.println("3) t2 = " + t2.volume);

		t1.volume = 4;

		System.out.println("4) t1 = " + t1.volume);
		System.out.println("4) t2 = " + t2.volume);

	}

}
