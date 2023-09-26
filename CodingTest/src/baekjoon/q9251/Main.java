package baekjoon.q9251;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char[] arr1 = br.readLine().toCharArray();
		char[] arr2 = br.readLine().toCharArray();
		br.close();
		
		int arr1Len = arr1.length;
		int arr2Len = arr2.length;
		int[][] dp = new int[arr1Len+1][arr2Len+1];
		
		for(int i=1; i<=arr1Len; i++) {
			for(int j=1; j<=arr2Len; j++) {
				if(arr1[i-1] == arr2[j-1]) dp[i][j] = dp[i-1][j-1] + 1;
				else dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
			}
		}
		
		System.out.println(dp[arr1Len][arr2Len]);
		
	}
}
