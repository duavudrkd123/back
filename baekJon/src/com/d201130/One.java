package com.d201130;

public class One {

	public static void main(String[] args) {
		int n = 3;
		int a = 0;
		int sum = 0;
		for (int i = 0; i <= n; i++) {
			sum = i + sum;
		}
		System.out.println(sum);
	}
}
