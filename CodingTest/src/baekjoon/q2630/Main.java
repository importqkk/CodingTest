package baekjoon.q2630;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static int w = 0;
	public static int b = 0;
	public static int[][] arr;
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		arr = new int[n][n];
		StringTokenizer st;
		for(int i=0; i<n; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j=0; j<n; j++) arr[i][j] = Integer.parseInt(st.nextToken());
		}
		br.close();
		
		calc(0, 0, n);
		
		StringBuilder sb = new StringBuilder();
		sb.append(w).append("\n").append(b);
		System.out.println(sb);
		
	}
	
	private static void calc(int row, int col, int size) {
		if(color(row, col, size)) {
			if(arr[row][col] == 0) w++;
			else b++;
			return;
		}
		int half = size / 2;
		calc(row, col, half);
		calc(row, col+half, half);
		calc(row+half, col, half);
		calc(row+half, col+half, half);
	}

	private static boolean color(int row, int col, int size) {
		int c = arr[row][col];
		for(int i=row; i<row+size; i++) for(int j=col; j<col+size; j++) if(arr[i][j] != c) return false;
		return true;
	}
}
