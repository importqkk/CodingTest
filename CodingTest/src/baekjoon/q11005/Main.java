package baekjoon.q11005;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		
		StringBuilder sb = new StringBuilder();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int n = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		br.close();
		
		while(n > 0) {
			if(n % b >= 10) sb.append((char)(n % b + 55));
			else sb.append(n % b);
			n = n / b;
		}
		
		System.out.println(sb.reverse().toString());
		
	}
}
