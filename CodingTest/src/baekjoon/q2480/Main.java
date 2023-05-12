package baekjoon.q2480;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
		sc.close();
		
		boolean isSingle = a != b && b != c && a != c;
		boolean isTriple = a == b && b == c;
		
		if(isSingle) {
			int max1 = Math.max(a, b);
			int max2 = Math.max(max1, c);
			System.out.println(max2 * 100);
		}
		else if(isTriple) {
			System.out.println(10000 + a * 1000);
		}
		boolean isA = (a == b && a != c) || (a == c && a != b);
		boolean isB = (b == c && b != a);
		if(isA) System.out.println(1000 + a * 100);
		else if(isB) System.out.println(1000 + b * 100);
		
	}
}
