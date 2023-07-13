package baekjoon.q2587;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main2 {
	public static void main(String[] args) throws IOException {
		
		int[] arr = new int[5];
		int sum = 0;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		for(int i=0; i<5; i++) {
			arr[i] = Integer.parseInt(br.readLine());
			sum += arr[i];
		}
		br.close();
		
		for(int i=0; i<arr.length-1; i++) {
			int index = i;
			for(int j=i+1; j<arr.length; j++) {
				if(arr[index] > arr[j]) index = j;
			}
			int backup = arr[index];
			arr[index] = arr[i];
			arr[i] = backup;
		}
		
		System.out.println(sum/5);
		System.out.println(arr[2]);
		
	}
}
