package baekjoon.q4948;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		while(true) {
			int n = Integer.parseInt(br.readLine());
			if(n == 0) break;
			
			boolean[] prime = new boolean[(2 * n) + 1];
			prime[0] = prime[1] = true;
			for(int i=2; i<=Math.sqrt(prime.length); i++) {
				if(prime[i]) continue;
				for(int j=i*i; j<prime.length; j+=i) prime[j] = true;
			}
			
			int cnt = 0;
			for(int i=n+1; i<=2*n; i++) {
				if(!prime[i]) cnt++;
			}
			
			sb.append(cnt).append("\n");
		}
		br.close();
		
		System.out.println(sb.toString());
		
	}
}
