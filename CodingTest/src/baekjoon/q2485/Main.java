package baekjoon.q2485;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		br.close();
		
		Arrays.sort(arr);
		int gcd = 0;
		for(int i=0; i<n-1; i++) {
			int dist = arr[i+1] - arr[i];
			gcd = gcd(dist, gcd);
		}
		
		System.out.println((arr[n-1] - arr[0]) / gcd + 1 - arr.length);
		
	}
	
	private static int gcd(int a, int b) {
		if(b == 0) return a;
		else return gcd(b, a % b);
	}
	
}
