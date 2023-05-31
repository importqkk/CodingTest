package baekjoon.q4344;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		
		StringBuilder sb = new StringBuilder();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int c = Integer.parseInt(br.readLine());
		int[] arr;
		
		for(int i=0; i<c; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			
			int n = Integer.parseInt(st.nextToken());
			arr = new int[n];
			
			double sum = 0;
			for(int j=0; j<n; j++) {
				arr[j] = Integer.parseInt(st.nextToken());
				sum += arr[j];
			}
			double avg = sum / n;
			
			double above = 0;
			for(int k=0; k<n; k++) {
				if(arr[k] > avg) above++;
			}
			
			double ans = (above / n) * 100;
			sb.append(String.format("%.3f", ans)).append("%").append("\n");
			
		}
		
		br.close();
		
		System.out.println(sb.toString());
		
	}
}
