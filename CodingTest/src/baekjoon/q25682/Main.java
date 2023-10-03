package baekjoon.q25682;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		
		int[][] arr = new int[n+1][m+1];
		boolean color = false;
		String str;
		char c;
		for(int i=1; i<=n; i++) {
			str = br.readLine();
			for(int j=1; j<=m; j++) {
				c = str.charAt(j-1);
				if(!color && c == 'W') arr[i][j] = 1;
				else if(color && c =='B') arr[i][j] = 1;
				color = !color;
			}
			if(m % 2 == 0) color = !color;
		}
		br.close();
		
		int tmp;
		for(int i=1; i<=n; i++) {
			tmp = arr[i][1];
			for(int j=2; j<=m; j++) {
				tmp += arr[i][j];
				arr[i][j] = tmp;
			}
		}
		
		for(int i=1; i<=m; i++) {
			tmp = arr[1][i];
			for(int j=2; j<=n; j++) {
				tmp += arr[j][i];
				arr[j][i] = tmp;
			}
		}
		
		int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
		for(int i=k; i<=n; i++) {
			for(int j=k; j<=m; j++) {
				tmp = arr[i][j] - (arr[i-k][j] + arr[i][j-k] - arr[i-k][j-k]);
				min = Math.min(min, tmp);
				max = Math.max(max, tmp);
			}
		}
		
		System.out.println(Math.min(min, k*k - max));
		
	}
}
