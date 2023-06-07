package baekjoon.q2563;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int[][] arr = new int[100][100];
		int c = Integer.parseInt(br.readLine());
		int s = 100 * c;
		int t = 0;
		
		for(int i=0; i<c; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			for(int j=a; j<a+10; j++) {
				for(int k=b; k<b+10; k++) {
					arr[j][k]++;
				}
			}
		}
		
		br.close();
		
		for(int i=0; i<100; i++) {
			for(int j=0; j<100; j++) {
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
		
		for(int i=0; i<100; i++) {
			for(int j=0; j<100; j++) {
				
				for(int k=1; k<c; k++) {
					if(arr[i][j] > k) t++;
				}
			}
		}
		
		System.out.println(s - t);
		
	}
}
