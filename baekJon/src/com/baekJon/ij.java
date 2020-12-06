package com.baekJon;

public class ij {
	public static void main(String[] args) {
		int[] array = { 12, 23, 34, 123, 432, 21, 90 };
		int r = 0;
		int y = 0;
		int a = array.length;
		for (int i = 0; i < a; i++) {
			if (r < array[i]) {
				r = array[i];
				y = i;
			}

		}
		System.out.println("최대값: " + r);
		System.out.println("위치: "+y);
	}
}
