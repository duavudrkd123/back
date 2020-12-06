package com.baekJon;

import java.util.Scanner;

public class cd {
	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
		int a = 472;
		System.out.println("값을 입력하세요");
		int b = sc.nextInt();
		int rr = a*b;
		int r;
		while (b > 0) {
			r = b % 10 * a;
			System.out.println(r);
			b /= 10;
		}
		System.out.println(rr);
	}
}
