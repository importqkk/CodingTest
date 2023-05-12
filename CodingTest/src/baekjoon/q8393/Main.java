package baekjoon.q8393;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		
		int a = 0;
		for(int i = 1; i <= n; i++) a += i;
		
		System.out.println(a);
		
	}
}
