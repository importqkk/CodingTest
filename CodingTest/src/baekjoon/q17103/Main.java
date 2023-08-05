package baekjoon.q17103;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		
		boolean[] prime = new boolean[1000001];
		prime[0] = prime[1] = true;
		for(int i=2; i<Math.sqrt(prime.length); i++) {
			if(prime[i]) continue;
			for(int j=i*i; j<1000001; j+=i) prime[j] = true;
		}
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int t = Integer.parseInt(br.readLine());
		for(int i=0; i<t; i++) {
			int n = Integer.parseInt(br.readLine());
			int cnt = 0;
			for(int j=2; j<=n/2; j++) {
				if(!prime[j] && !prime[n - j]) cnt++;
			}
			sb.append(cnt).append("\n");
		}
		br.close();
		
		System.out.println(sb.toString());
		
	}
}
