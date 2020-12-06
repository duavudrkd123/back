package com.baekJon;

import java.util.Scanner;

public class gh {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = 0;
		int b = 0;
		int c = 0;
		int d = 0;
		int r = 0;
		System.out.println("케이스 번호를 입력해주세요");
		c = sc.nextInt();
		while (d != c) {
			System.out.println("첫번째 번호");
			a = sc.nextInt();
			System.out.println("두번째 번호");
			b = sc.nextInt();
			r = a + b;
			System.out.println("Case #" + (d + 1) + ": " + r);
			d++;
		}
		System.out.println("System Shutdown");

	}
}
