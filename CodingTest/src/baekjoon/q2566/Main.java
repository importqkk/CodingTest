package baekjoon.q2566;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int[][] arr = new int[9][9];
		int max = -1;
		int a = 0;
		int b = 0;
		
		for(int i=0; i<9; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			for(int j=0; j<9; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
				if(arr[i][j] > max) {
					max = arr[i][j];
					a = i;
					b = j;
				}
			}
		}
		
		br.close();
		
		System.out.println(
			sb.append(max).append("\n")
			  .append(a+1).append(" ")
			  .append(b+1)
		);
		
	}
}
