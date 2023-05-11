package baekjoon.q2753;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int y = sc.nextInt();
		sc.close();
		
		boolean leaf = y % 4 == 0 && y % 100 != 0 || y % 400 == 0;
		
		if(leaf) System.out.println(1);
		else System.out.println(0);
		
	}
}
