package baekjoon.q2588;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();
		
		int b1 = b % 10;
		int b2 = b % 100 / 10;
		int b3 = b / 100;
		
		System.out.println(a*b1);
		System.out.println(a*b2);
		System.out.println(a*b3);
		System.out.println((a*b1)+(a*b2*10)+(a*b3*100));
		
	}
}
