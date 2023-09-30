package baekjoon.q10986;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main2 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		int[] arr = new int[m];
		int cnt = 0;
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<n; i++) {
			cnt = (cnt + Integer.parseInt(st.nextToken())) % m;
			arr[cnt]++;
		}
		br.close();
		
		long ans = arr[0];
		for(int i=0; i<m; i++) ans += (long)arr[i] * (arr[i] - 1) / 2;
		
		System.out.println(ans);
		
	}
}
