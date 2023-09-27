package baekjoon.q12865;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		
		int[] arr1 = new int[n+1];
		int[] arr2 = new int[n+1];
		int[][] dp = new int[n+1][k+1];
		
		for(int i=1; i<=n; i++) {
			st = new StringTokenizer(br.readLine());
			arr1[i] = Integer.parseInt(st.nextToken());
			arr2[i] = Integer.parseInt(st.nextToken());
		}
		br.close();
	
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=k; j++) {
				if(arr1[i] > j) dp[i][j] = dp[i-1][j];
				else dp[i][j] = Math.max(dp[i-1][j], dp[i-1][j-arr1[i]]+arr2[i]);
			}
		}
		
		System.out.println(dp[n][k]);
		
	}
}
