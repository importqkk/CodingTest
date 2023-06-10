package baekjoon.q2720;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main2 {
	public static void main(String[] args) throws IOException {
		
		StringBuilder sb = new StringBuilder();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		int q = 0, d = 0, n = 0, p = 0;
		
		for(int i=0; i<t; i++) {
			int c = Integer.parseInt(br.readLine());
			
			q = c / 25;
			c %= 25;
			
			d = c / 10;
			c %= 10;
			
			n = c / 5;
			c %= 5;
			
			p = c;
			
			sb.append(q).append(" ")
				.append(d).append(" ")
				.append(n).append(" ")
				.append(p).append("\n");
		}
		
		br.close();
		
		System.out.println(sb.toString());
		
	}
}
