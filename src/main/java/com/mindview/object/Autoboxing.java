package com.mindview.object;

public class Autoboxing {

	byte bp;
	short sp;
	int ip;
	long lp;
	float fp;
	double dp;

	Byte b;
	Short s;
	Integer i;
	Long l;
	Float f;
	Double d;

	public void converter() {
		b = bp;
		s = sp;
		i = ip;
		l = lp;
		f = fp;
		d = dp;
	}

	public void printer() {
		System.out.println(bp + " = " + b);
		System.out.println(sp + " = " + s);
		System.out.println(ip + " = " + i);
		System.out.println(lp + " = " + l);
		System.out.println(fp + " = " + f);
		System.out.println(dp + " = " + d);
	}

	public void run() {
		converter();
		printer();
	}

}