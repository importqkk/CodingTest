package baekjoon.q1904;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	private static int[] arr;
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		br.close();
		
		arr = new int[n+1];
		System.out.println(tile(n));
		
	}

	private static int tile(int n) {
		if(arr[n] != 0) return arr[n];
		if(n == 1) return 1;
		else if(n == 2) return 2;
		else return arr[n] = (tile(n-2) + tile(n-1)) % 15746;
	}
}
