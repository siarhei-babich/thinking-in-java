package com.mindview.object;

public class Exercise10 {

	public static void main(String[] args) {
		System.out.println("args = " + args.toString());
		System.out.println("args l = " + args.length);
		for (String arg : args) {
			System.out.println(arg);
		}
	}

}