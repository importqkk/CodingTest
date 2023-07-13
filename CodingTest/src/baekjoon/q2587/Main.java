package baekjoon.q2587;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException {
		
		int[] arr = new int[5];
		int sum = 0;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		for(int i=0; i<5; i++) {
			arr[i] = Integer.parseInt(br.readLine());
			sum += arr[i];
		}
		br.close();
		
		Arrays.sort(arr);
		
		System.out.println(sum/5);
		System.out.println(arr[2]);
		
	}
}
