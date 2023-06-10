package baekjoon.q2720;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		
		StringBuilder sb = new StringBuilder();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		
		for(int i=0; i<t; i++) {
			int q = 0;
			int d = 0;
			int n = 0;
			int p = 0;
			int c = Integer.parseInt(br.readLine());
			while(c > 0) {
				if(c - 25 >= 0) {
					q++;
					c = c - 25;
				}
				else if(c - 10 >= 0) {
					d++;
					c = c - 10;
				}
				else if(c - 5 >= 0) {
					n++;
					c = c - 5;
				}
				else {
					p++;
					c = c - 1;
				}
			}
			sb.append(q).append(" ")
				.append(d).append(" ")
				.append(n).append(" ")
				.append(p).append("\n");
		}
		
		br.close();
		
		System.out.println(sb.toString());
		
	}
}
