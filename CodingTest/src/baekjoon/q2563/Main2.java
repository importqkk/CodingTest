package baekjoon.q2563;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main2 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		boolean[][] arr = new boolean[100][100];
		int c = Integer.parseInt(br.readLine());
		int t = 0;
		
		for(int i=0; i<c; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			for(int j=a; j<a+10; j++) {
				for(int k=b; k<b+10; k++) {
					if(!arr[j][k]) {
						t++;
						arr[j][k] = true;
					}
				}
			}
		}
		
		br.close();
		
		System.out.println(t);
		
	}
}
