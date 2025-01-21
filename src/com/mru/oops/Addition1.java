package com.mru.oops;

public class Addition1 implements Addition {

	@Override
	public void add1() {
		int num1 = 200;
		int num2 = 100;
		int res = num1+num2;
		System.out.println(res);

	}

	@Override
	public void add2(int num1, int num2) {
		int res = num1+num2;
		System.out.println(res);

	}

	@Override
	public int add3() {
		int num1 = 200;
		int num2 = 100;
		int res = num1+num2;
		return (res);
	}

	@Override
	public int add4(int num1, int num2) {
		int res = num1+num2;
		return (res);
	}

}
