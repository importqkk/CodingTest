package baekjoon.q6549;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static int[] arr;
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		
		int n;
		while(true) {
			st = new StringTokenizer(br.readLine());
			n = Integer.parseInt(st.nextToken());
			if(n == 0) break;
			arr = new int[n];
			for(int i=0; i<n; i++) arr[i] = Integer.parseInt(st.nextToken());
			sb.append(calc(0, n-1)).append("\n");
			arr = null;
		}
		br.close();
		
		System.out.println(sb);
		
	}
	
	private static long calc(int a, int b) {
		if(a == b) return arr[a];
		int half = (a + b) / 2;
		long left = calc(a, half);
		long right = calc(half + 1, b);
		long max = Math.max(left, right);
		max = Math.max(max, middle(a, b, half));
		return max;
	}

	private static long middle(int a, int b, int half) {
		int left = half;
		int right = half;
		long height = arr[half];
		long max = height;
		while(a < left && right < b) {
			if(arr[left - 1] < arr[right + 1]) {
				right++;
				height = Math.min(height, arr[right]);
			} else {
				left--;
				height = Math.min(height, arr[left]);
			}
			max = Math.max(max, height * (right - left + 1));
		}
		while(right < b) {
			right++;
			height = Math.min(height, arr[right]);
			max = Math.max(max, height * (right - left + 1));
		}
		while(a < left) {
			left--;
			height = Math.min(height, arr[left]);
			max = Math.max(max, height * (right - left + 1));
		}
		return max;
	}
}
