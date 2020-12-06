
package com.baekJon;

import java.util.Scanner;

 class ab {
	public static void main(String[] args) {
		int a = 0;
		int b = 0;
		int r = 0;
		boolean y = true;
		Scanner sc = new Scanner(System.in);
		while(y) {
			System.out.println("첫번째 값을 입력하세요");
			a = sc.nextInt();
			System.out.println("두번째 값을 입력하세요");		
			b = sc.nextInt();
			if(0<a && 10>=a && 0<b && 10>=b) {
				r = a - b;
			System.out.println(a + "-" + b + "=" + r);
				y = false;		
			} else {
				System.out.println("1이상 10이하의 수를 입력해주세요");
			}
		}
	}
}
