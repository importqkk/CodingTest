package baekjoon.q2805;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());
		int[] arr = new int[n];
		int min = 0, max = 0;
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			if(max < arr[i]) max = arr[i];
		}
		br.close();
		
		int half;
		long sum;
		while(min < max) {
			half = (min + max) / 2;
			sum = 0;
			for(int height : arr) if(height - half > 0) sum += height - half;
			if(sum < m) max = half;
			else min = half + 1;
		}
		
		System.out.println(min - 1);
		
	}
}
