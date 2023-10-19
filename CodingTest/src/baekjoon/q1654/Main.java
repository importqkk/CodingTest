package baekjoon.q1654;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int k = Integer.parseInt(st.nextToken()), n = Integer.parseInt(st.nextToken());
		int[] arr = new int[k];
		long max = 0;
		for(int i=0; i<k; i++) {
			arr[i] = Integer.parseInt(br.readLine());
			if(max < arr[i]) max = arr[i];
		}
		br.close();
		
		max++;
		long min = 0, half = 0, cnt;
		
		while(min < max) {
			half = (max + min) / 2;
			cnt = 0;
			for(int i=0; i<arr.length; i++) cnt += arr[i] / half;
			if(cnt < n) max = half;
			else min = half + 1;
		}
		
		System.out.println(min - 1);
		
	}
}
