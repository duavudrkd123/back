package com.baekJon;

public class ef {
	public static void main(String[] args) {

		int a = 5;
		int b = 8;
		int c = 4;

		System.out.println((a + b) % c);
		System.out.println((a % c) + (b % c));
		System.out.println((a * b) % c);
		System.out.println(((a % c) * (b % c)) % c);
	}
}
