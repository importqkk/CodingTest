package baekjoon.q10986;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 시간 초과
public class Main {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		int[] arr = new int[n+1];
		st = new StringTokenizer(br.readLine());
		for(int i=1; i<=n; i++) arr[i]=arr[i-1]+Integer.parseInt(st.nextToken());
		br.close();
		
		int cnt = 0;
		for(int i=1; i<=n; i++) for(int j=i; j<=n; j++) if((arr[j]-arr[i-1])%m==0) cnt++;
		
		System.out.println(cnt);
		
	}
}
