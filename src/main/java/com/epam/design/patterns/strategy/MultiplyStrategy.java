package com.epam.design.patterns.strategy;

public class MultiplyStrategy implements Strategy {

	public int doOperation(int int1, int int2) {
		return int1 * int2;
	}

}