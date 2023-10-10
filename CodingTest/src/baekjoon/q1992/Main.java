package baekjoon.q1992;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static int[][] arr;
	public static StringBuilder sb = new StringBuilder();
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		arr = new int[n][n];
		for(int i=0; i<n; i++) {
			String s = br.readLine();
			for(int j=0; j<n; j++) arr[i][j] = s.charAt(j) - '0';
		}
		br.close();
		
		calc(0, 0, n);
		System.out.println(sb);
		
	}
	
	private static void calc(int a, int b, int size) {
		if(isSame(a, b, size)) {
			sb.append(arr[a][b]);
			return;
		}
		sb.append("(");
		int half = size / 2;
		calc(a, b, half);
		calc(a, b+half, half);
		calc(a+half, b, half);
		calc(a+half, b+half, half);
		sb.append(")");
	}

	private static boolean isSame(int a, int b, int size) {
		int num = arr[a][b];
		for(int i=a; i<a+size; i++) for(int j=b; j<b+size; j++) if(arr[i][j] != num) return false;
		return true;
	}
}
