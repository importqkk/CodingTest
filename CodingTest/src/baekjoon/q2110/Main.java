package baekjoon.q2110;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static int[] arr;
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken()), c = Integer.parseInt(st.nextToken());
		arr = new int[n];
		for(int i=0; i<n; i++) arr[i] = Integer.parseInt(br.readLine());
		br.close();
		
		Arrays.sort(arr);
		
		int start = 1, end = arr[n-1]-arr[0]+1, half;
		while(start < end) {
			half = (start + end) / 2;
			if(clac(half) < c) end = half;
			else start = half + 1;
		}
		
		System.out.println(start - 1);
		
	}
	
	private static int clac(int half) {
		int cnt = 1, last = arr[0], location;
		for(int i=1; i<arr.length; i++) {
			location = arr[i];
			if(location - last >= half) {
				cnt++;
				last = location;
			}
		}
		return cnt;
	}
}
