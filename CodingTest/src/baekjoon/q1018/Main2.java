package baekjoon.q1018;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.IOException;
 
public class Main2 {
 
	public static boolean[][] arr;
	public static int min = 64;
 
	public static void main(String[] args) throws IOException {
 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());
		arr = new boolean[n][m];
		
		for(int i=0; i<n; i++) {
			String line = br.readLine();
			for(int j=0; j<m; j++) {
				if(line.charAt(j) == 'W') arr[i][j] = true;
				else arr[i][j] = false;
			}
		}
		br.close();
		
		int nRow = n - 7;
		int mCol = m - 7;
		for(int i=0; i<nRow; i++) {
			for(int j=0; j<mCol; j++) {
				find(i, j);
			}
		}
		
		System.out.println(min);
		
	}
 
	
	public static void find(int x, int y) {
		
		int endX = x + 8;
		int endY = y + 8;
		int cnt = 0;
		boolean tf = arr[x][y];
 
		for(int i=x; i<endX; i++) {
			for(int j=y; j<endY; j++) {
				if (arr[i][j] != tf) cnt++;
				tf = !tf;
			}
			tf = !tf;
		}

		cnt = Math.min(cnt, 64 - cnt);
		min = Math.min(min, cnt);
		
	}
}