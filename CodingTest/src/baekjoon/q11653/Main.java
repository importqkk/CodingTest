package baekjoon.q11653;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		
		StringBuilder sb = new StringBuilder();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		br.close();
		
		int prime = 2;
		while(n != 1) {
			if(n % prime == 0) {
				n /= prime;
				sb.append(prime).append("\n");
			}
			else prime++;
		}
		
		System.out.println(sb.toString());
		
	}
}
