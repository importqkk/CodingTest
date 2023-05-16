package baekjoon.q2438;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		
		StringBuffer b = new StringBuffer();
		
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= i; j++) {
				b.append("*");
			}
			b.append("\n");
		}
		
		System.out.println(b);
		
	}
}
