package baekjoon.q25304;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt(),  n = sc.nextInt();
		
		int t = 0;
		
		for(int i = 0; i < n; i++) {
			int a = sc.nextInt(), b = sc.nextInt();
			t += (a*b);
		}
		sc.close();
		
		if(x == t) System.out.println("Yes");
		else System.out.println("No");
		
	}
}
