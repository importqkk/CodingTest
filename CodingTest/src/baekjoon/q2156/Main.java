package baekjoon.q2156;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	private static int n;
	private static int[] wine;
	private static Integer[] sum;
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		wine = new int[n+1];
		sum = new Integer[n+1];
		for(int i=1; i<=n; i++) wine[i] = Integer.parseInt(br.readLine());
		br.close();
		
		sum[0] = 0;
		sum[1] = wine[1];
		if(n > 1) sum[2] = wine[1] + wine[2];
		
		System.out.println(calc(n));
		
	}

	private static int calc(int n) {
		if(sum[n] == null) {
			sum[n] = Math.max(Math.max(calc(n-2), calc(n-3) + wine[n-1]) + wine[n], calc(n-1));
		}
		return sum[n];
	}
}
