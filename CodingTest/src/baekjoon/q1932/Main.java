package baekjoon.q1932;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	
	private static int[][] arr;
	private static Integer[][] maxSum;
	private static int n;
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		arr = new int[n][n];
		maxSum = new Integer[n][n];
		
		StringTokenizer st;
		for(int i=0; i<n; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j=0; j<=i; j++) arr[i][j] = Integer.parseInt(st.nextToken());
		}
		br.close();
		
		for(int i=0; i<n; i++) maxSum[n-1][i] = arr[n-1][i];
		System.out.println(sum(0, 0));
		
	}

	private static int sum(int depth, int idx) {
		if(depth == n-1) return maxSum[depth][idx];
		if(maxSum[depth][idx] == null) {
			maxSum[depth][idx] 
					= Math.max(sum(depth+1, idx), sum(depth+1, idx+1)) 
						+ arr[depth][idx];
		}
		return maxSum[depth][idx];
	}
}
