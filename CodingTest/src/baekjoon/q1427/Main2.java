package baekjoon.q1427;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main2 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String n = br.readLine();
		br.close();
		
		int[] arr = new int[10];
		
		for(int i=0; i<n.length(); i++) {
			arr[n.charAt(i) - '0']++;
		}
		
		StringBuilder sb = new StringBuilder();
		
		for(int i=arr.length-1; i>=0; i--) {
			while(arr[i] > 0) {
				sb.append(i); arr[i]--;
			}
		}
		
		System.out.println(sb.toString());
		
	}
}
