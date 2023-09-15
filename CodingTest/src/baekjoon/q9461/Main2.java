package baekjoon.q9461;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main2 {
	
	private static long[] arr = new long[101];
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		padovan();
		int t = Integer.parseInt(br.readLine());
		for(int i=0; i<t; i++) {
			sb.append(arr[Integer.parseInt(br.readLine())])
			  .append("\n");
		}
		br.close();
		
		System.out.println(sb.toString());
		
	}

	private static void padovan() {
		arr[1] = arr[2] = arr[3] = 1;
		for(int i=4; i<101; i++) arr[i] = arr[i-3] + arr[i-2];
	} 
}
