package baekjoon.q10830;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static int[][] a;
	public static long b;
	public static int c = 1000, n;
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		b = Long.parseLong(st.nextToken());
		
		a = new int[n][n];
		for(int i=0; i<n; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j=0; j<n; j++) a[i][j] = Integer.parseInt(st.nextToken()) % c;
		}
		br.close();
		
		int[][] d = calc(a, b);
		
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) sb.append(d[i][j]).append(" ");
			sb.append("\n");
		}
		System.out.println(sb);
		
	}
	
	private static int[][] calc(int[][] a2, long b2) {
		if(b2 == 1L) return a2;
		int[][] c2 = calc(a2, b2/2);
		c2 = round(c2, c2);
		if(b2 % 2 == 1L) c2 = round(c2, a);
		return c2;
	}
	private static int[][] round(int[][] c2, int[][] c3) {
		int[][] d = new int[n][n];
		for(int i=0; i<n; i++) for(int j=0; j<n; j++) for(int k=0; k<n; k++) {
			d[i][j] += c2[i][k] * c3[k][j];
			d[i][j] %= c;
		}
		return d;
	}
}
