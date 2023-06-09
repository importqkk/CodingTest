package baekjoon.q2231;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		br.close();
		
		int ans = 0;
		
		for(int i=0; i<n; i++) {
			int num = i, sum = 0;
			while(num > 0) {
				sum += num % 10;
				num = num / 10;
			}
			if(sum + i == n) {
				ans = i; break;
			}
		}
		
		System.out.println(ans);
		
	}
}
