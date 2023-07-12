package baekjoon.q2750;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 버블정렬
public class Main3 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		br.close();
		
		for(int i=1; i<arr.length; i++) {
			for(int j=0; j<arr.length-1; j++) {
				if(arr[j] > arr[j+1]) {
					int backup = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = backup;
				}
			}
		}
		
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<arr.length; i++) {
			sb.append(arr[i]).append("\n");
		}
		
		System.out.println(sb.toString());
		
	}
}
