package baekjoon.q3003;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		for(int i=1; i<=6; i++) {
			int c = Integer.parseInt(st.nextToken());
			if(i <= 2) sb.append((1 - c)).append(" ");
			else if(i <= 5) sb.append((2 - c)).append(" ");
			else sb.append((8 - c)).append(" ");
		}
		br.close();
		
		System.out.println(sb.toString());
		
	}
}
