package baekjoon.q25314;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		s.close();
		
		StringBuffer b = new StringBuffer();
		for(int i = 0; i < n / 4; i++) {
			b.append("long ");
		}
		b.append("int");
		
		System.out.println(b);
		
	}
}
