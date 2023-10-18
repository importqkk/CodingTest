package baekjoon.q1920;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static int[] a;
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		a = new int[n];
		for(int i=0; i<n; i++) a[i] = Integer.parseInt(st.nextToken());
		Arrays.sort(a);
		
		int m = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<m; i++) {
			if(calc(Integer.parseInt(st.nextToken())) >= 0) {				
				sb.append(1).append("\n");
			} else sb.append(0).append("\n");
		}
		br.close();
		
		System.out.println(sb);
		
	}

	private static int calc(int key) {
		int start = 0;
		int end = a.length - 1;
		while(start <= end) {
			int half = (start + end) / 2;
			if(key < a[half]) end = half - 1;
			else if(key > a[half]) start = half + 1;
			else return half;
		}
		return -1;
	}
}
