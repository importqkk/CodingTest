package baekjoon.q10813;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int[] arr = new int[n];
		
		for(int i = 0; i < n; i++) {
			arr[i] = i+1;
		}
		for(int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			int b1 = Integer.parseInt(st.nextToken()) - 1;
			int b2 = Integer.parseInt(st.nextToken()) - 1;
			int temp = arr[b1];
			arr[b1] = arr[b2];
			arr[b2] = temp;
		}
		br.close();
		
		for(int i = 0; i < n; i++) {
			sb.append(arr[i]).append(" ");
		}
		System.out.println(sb.toString());
		
	}
}
