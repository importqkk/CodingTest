package baekjoon.q1978;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		int[] arr = new int[n];
		int prime = 0;
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		for(int i=0; i<n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		br.close();
		
		for(int j=0; j<arr.length; j++) {
			int num = arr[j];
			int cnt = 0;
			for(int k=1; k<=num; k++) {
				if(num % k == 0) cnt++;
			}
			if(cnt == 2) prime++;
		}
		
		System.out.println(prime);
		
	}
}
