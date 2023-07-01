package baekjoon.q24265;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long n = Long.parseLong(br.readLine());
		br.close();
		
		/*long c = 0;
		
		for(int i=1; i<=n-1; i++) {
			for(int j=i+1; j<=n; j++) {
				c++;
			}
		}*/
		
		System.out.println((n * (n - 1)) / 2);
		// System.out.println(c);
		System.out.println(2);
		
	}
}
