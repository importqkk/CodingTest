package baekjoon.q24267;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main2 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		br.close();
		
		int c = 0;
		
		for(int i=1; i<=n-2; i++) {
			for(int j=i+1; j<=n-1; j++) {
				for(int k=j+1; k<=n; k++) {
					c++;
				}
			}
		}
		
		System.out.println(c);
		System.out.println(3);
		
	}
}
