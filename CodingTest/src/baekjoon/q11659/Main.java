package baekjoon.q11659;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 시간초과
public class Main {
	private static int[] arr;
	private static StringBuilder sb = new StringBuilder();
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		arr = new int[n];
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<n; i++) arr[i] = Integer.parseInt(st.nextToken());
		
		for(int i=0; i<m; i++) {
			st = new StringTokenizer(br.readLine());
			calc(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
		}
		br.close();
		
		System.out.println(sb.toString());
		
	}
	
	private static void calc(int a, int b) {
		int sum = 0;
		for(int i=a; i<=b; i++) sum += arr[i-1];
		sb.append(sum).append("\n");
	}
}
