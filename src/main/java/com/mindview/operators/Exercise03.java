package com.mindview.operators;

public class Exercise03 {

	public static void main(String args[]) {

		Tank t = new Tank();
		t.volume = 1;
		System.out.println("1) t = " + t.volume);
		f(t);
		System.out.println("2) t = " + t.volume);

	}

	static void f(Tank t) {
		t.volume = 0;
	}

}
