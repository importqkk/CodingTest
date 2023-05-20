package baekjoon.q10811;
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
		
		for(int a = 0; a < arr.length; a++) {
			arr[a] = a + 1;
		}
		
		for(int a = 0; a < m; a++) {
			st = new StringTokenizer(br.readLine(), " ");
			int i = Integer.parseInt(st.nextToken()) - 1;
			int j = Integer.parseInt(st.nextToken()) - 1;
			
			for(int b = i; b <= j; b++, j--) {
				int temp = arr[b];
				arr[b] = arr[j];
				arr[j] = temp;
			}
		}
		br.close();
		
		for(int a=0; a<arr.length; a++) {
			sb.append(arr[a]).append(" ");
		}
		System.out.println(sb.toString());
		
	}
}
