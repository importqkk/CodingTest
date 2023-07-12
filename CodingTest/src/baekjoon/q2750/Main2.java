package baekjoon.q2750;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 선택정렬
public class Main2 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		br.close();
		
		for(int j=0; j<arr.length-1; j++) {
			int index = j;
			for(int i=j+1; i<arr.length; i++) {
				if(arr[index] > arr[i]) index = i;
			}
			int backup = arr[j];
			arr[j] = arr[index];
			arr[index] = backup;
		}
		
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<arr.length; i++) {
			sb.append(arr[i]).append("\n");
		}
		
		System.out.println(sb.toString());
		
	}
}
