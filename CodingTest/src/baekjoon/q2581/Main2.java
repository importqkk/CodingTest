package baekjoon.q2581;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main2 {
	public static void main(String[] args) throws IOException {
		
		StringBuilder sb = new StringBuilder();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int m = Integer.parseInt(br.readLine());
		int n = Integer.parseInt(br.readLine());
		br.close();
		
		// 에라토스테네스의 체 알고리즘
		boolean[] prime = new boolean[n + 1];
		prime[0] = prime[1] = true;
		for(int i=2; i<= Math.sqrt(prime.length); i++) {
			if(prime[i]) continue;
			for(int j=i*i; j<prime.length; j+=i) {
				prime[j] = true;
			}
		}
		
		int sum = 0;
		int min = Integer.MAX_VALUE;
		for(int i=m; i<=n; i++) {
			if(prime[i] == false) {
				sum += i;
				if(min == Integer.MAX_VALUE) {
					min = i;
				}
			}
		}
		if(sum == 0) {
			System.out.println(-1);
		}
		else {
			sb.append(sum).append("\n").append(min);
			System.out.println(sb.toString());
		}
		
	}
}
