package baekjoon.q11399;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] arr = new int[n];
		for(int i=0; i<n; i++) arr[i] = Integer.parseInt(st.nextToken());
		br.close();
		
		Arrays.sort(arr);
		
		int sum = 0, acc = 0;
		for(int i=0; i<n; i++) {
			sum += acc + arr[i];
			acc += arr[i];
		}
		
		System.out.println(sum);
		
	}
}