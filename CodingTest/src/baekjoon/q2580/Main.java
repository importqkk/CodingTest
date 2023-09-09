package baekjoon.q2580;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	
	public static int n = 9;
	public static int cnt = 0;
	public static int[][] a = new int[10][10];
	public static boolean[][] c = new boolean[10][10];
	public static boolean[][] c2 = new boolean[10][10];
	public static boolean[][] c3 = new boolean[10][10];
	
	public static int square(int x, int y) {
		return (x / 3) * 3 + (y / 3);
	}
	
	public static boolean go(int z) throws IOException {
		cnt += 1;
		if(cnt >= 10000000) return true;
		if(z == 81) {
			StringBuilder sb = new StringBuilder();
			for(int i=0; i<n; i++) {
				for(int j=0; j<n; j++) {
					sb.append(a[i][j]).append(" ");
				}
				sb.append("\n");
			}
			System.out.println(sb.toString());
			return true;
		}
		int x = z / n;
		int y = z % n;
		if(a[x][y] != 0) return go(z + 1);
		else {
			for(int i=1; i<=9; i++) {
				if(!c[x][i] && !c2[y][i] && !c3[square(x,y)][i]) {
					c[x][i] = c2[y][i] = c3[square(x,y)][i] = true;
					a[x][y] = i;
					if(go(z + 1)) return true;
					a[x][y] = 0;
	                c[x][i] = c2[y][i] = c3[square(x,y)][i] = false;
				}
			}
		}
		return false;
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		for(int i=0; i<n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int j=0; j<n; j++) {
				a[i][j] = Integer.parseInt(st.nextToken());
				if(a[i][j] != 0) {
					c[i][a[i][j]] = true;
	                c2[j][a[i][j]] = true;
	                c3[square(i, j)][a[i][j]] = true;
				}
			}
		}
		go(0);
	}
}
