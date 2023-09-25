package baekjoon.q2565;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {
	private static int n;
	private static int[][] ab;
	private static Integer[] dp;
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		ab = new int[n][2];
		dp = new Integer[n];
		StringTokenizer st;
		for(int i=0; i<n; i++) {
			st = new StringTokenizer(br.readLine());
			ab[i][0] = Integer.parseInt(st.nextToken());
			ab[i][1] = Integer.parseInt(st.nextToken());
		}
		br.close();
		
		Arrays.sort(ab, new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[] o2) {
				return o1[0] - o2[0];
			}
		});
		
		for(int i=0; i<dp.length; i++) {
			dp[i] = 1;
			for(int j=0; j<i; j++) {
				if(ab[i][1] > ab[j][1]) dp[i] = Math.max(dp[i], dp[j]+1);
			}
		}
		
		int max = 0;
		for(int i=0; i<n; i++) max = Math.max(max, dp[i]);
		
		System.out.println(n - max);
		
	}
}
