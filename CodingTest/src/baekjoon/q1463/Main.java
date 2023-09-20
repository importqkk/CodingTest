package baekjoon.q1463;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	private static Integer[] arr;
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		br.close();
		
		arr = new Integer[n+1];
		arr[0] = arr[1] = 0;
		
		System.out.println(find(n));
		
	}

	private static int find(int n) {
		if(arr[n] == null) {
			if(n % 6 == 0) arr[n] = Math.min(find(n-1), Math.min(find(n/3), find(n/2))) + 1;
			else if(n % 3 == 0) arr[n] = Math.min(find(n/3), find(n-1)) + 1;
			else if(n % 2 == 0) arr[n] = Math.min(find(n/2), find(n-1)) + 1;
			else arr[n] = find(n-1) + 1;
		}
		return arr[n];
	}
}
