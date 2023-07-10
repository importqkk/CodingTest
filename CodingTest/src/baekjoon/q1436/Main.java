package baekjoon.q1436;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		br.close();
		
		int ans = 666;
		int round = 1;
		
		while(n > round) {
			ans++;
			if(String.valueOf(ans).contains("666"))
				round++;
		}
		
		System.out.println(ans);
		
	}
}
