package baekjoon.q14889;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	
	public static int n;
	public static int[][] arr;
	public static boolean[] visit;
	public static int min = Integer.MAX_VALUE;
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		arr = new int[n][n];
		visit = new boolean[n];
		StringTokenizer st;
		for(int i=0; i<n; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j=0; j<n; j++) arr[i][j] = Integer.parseInt(st.nextToken());
		}
		br.close();
		
		dfs(0, 0);
		System.out.println(min);
		
	}

	private static void dfs(int idx, int depth) {
		if(depth == n / 2) {
			diff(); return;
		}
		for(int i=idx; i<n; i++) {
			if(!visit[i]) {
				visit[i] = true;
				dfs(i + 1, depth + 1);
				visit[i] = false;
			}
		}
	}

	private static void diff() {
		int start = 0, link = 0;
		for(int i=0; i<n-1; i++) {
			for(int j=i+1; j<n; j++) {
				if(visit[i] && visit[j]) {
					start += arr[i][j];
					start += arr[j][i];					
				} else if(!visit[i] && !visit[j]) {
					link += arr[i][j];
					link += arr[j][i];	 
				}
			}
		}
		int gap = Math.abs(start - link);
		if(gap == 0) {
			System.out.println(gap);
			System.exit(0);
		} 
		min = Math.min(gap, min);
	}
}
