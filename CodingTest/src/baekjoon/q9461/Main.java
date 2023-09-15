package baekjoon.q9461;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	private static long[] arr = new long[101];
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int t = Integer.parseInt(br.readLine());
		for(int i=0; i<t; i++) {
			int n = Integer.parseInt(br.readLine());
			sb.append(padovan(n)).append("\n");
		}
		br.close();
		
		System.out.println(sb.toString());
		
	}

	private static long padovan(int n) {
		if(arr[n] != 0) return arr[n];
		if(n <= 3) return 1;
		else return arr[n] = padovan(n-2) + padovan(n-3);
	} 
}
