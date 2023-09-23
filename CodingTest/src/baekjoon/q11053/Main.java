package baekjoon.q11053;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	private static int n;
	private static int[] a;
	private static int[] dp;
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		a = new int[n];
		dp = new int[n];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0; i<n; i++) a[i] = Integer.parseInt(st.nextToken());
		br.close();
		
		for(int i=0; i<n; i++) {
			dp[i] = 1;
			for(int j=0; j<i; j++) if(a[j]<a[i] && dp[i]<dp[j]+1) dp[i]=dp[j]+1;
		}
		
		int max = -1;
		for(int i=0; i<n; i++) max = dp[i] > max ? dp[i] : max;
		
		System.out.println(max);
		
	}
	
}
