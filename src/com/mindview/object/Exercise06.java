package com.mindview.object;
public class Exercise06 {

	public static void main(String[] args) {
		System.out.println(Integer.valueOf(storage("")));
		System.out.println(Integer.valueOf(storage("1")));
		System.out.println(Integer.valueOf(storage("a")));
	}

	static int storage(String s) {
		return s.length() * 2;
	}

}