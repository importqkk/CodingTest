package baekjoon.q2750;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 삽입정렬
public class Main4 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		br.close();
		
		for(int i=1; i<arr.length; i++) {
			int index = i;
			int backup = arr[i];
			
			while(index > 0 && arr[index-1] > backup) {
				arr[index] = arr[index-1];
				index--;
			}

			arr[index] = backup;
		}
		
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<arr.length; i++) {
			sb.append(arr[i]).append("\n");
		}
		
		System.out.println(sb.toString());
		
	}
}
