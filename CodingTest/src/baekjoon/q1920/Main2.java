package baekjoon.q1920;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main2 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());;
		int[] a = new int[n];
		for(int i=0; i<n; i++) a[i] = Integer.parseInt(st.nextToken());
		Arrays.sort(a);
		
		int m = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<m; i++) {
			if(Arrays.binarySearch(a, Integer.parseInt(st.nextToken())) >= 0) {				
				sb.append(1).append("\n");
			} else sb.append(0).append("\n");
		}
		br.close();
		
		System.out.println(sb);
		
	}
}
