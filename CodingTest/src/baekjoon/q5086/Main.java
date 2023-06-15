package baekjoon.q5086;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		
		StringBuilder sb = new StringBuilder();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		while(true) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			if(a == 0 && b == 0) break;
			
			int max = Math.max(a, b);
			int min = Math.min(a, b);
			
			if(max % min == 0) {
				if(a <= b) sb.append("factor").append("\n");
				else sb.append("multiple").append("\n");
			}
			else sb.append("neither").append("\n");
		}
		
		br.close();
		
		System.out.println(sb.toString());
		
	}
}
