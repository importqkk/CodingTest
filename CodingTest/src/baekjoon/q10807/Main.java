package baekjoon.q10807;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		int v = sc.nextInt();
		sc.close();
		
		int cnt = 0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i] == v) cnt++;
		}
		
		System.out.println(cnt);

	}
}
