package baekjoon.q2869;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int v = Integer.parseInt(st.nextToken());
		br.close();
		
		int c = 0;
		int d = 0;
		
		while(c < v) {
			d++;
			c += a;
			if(c >= v) break;
			c -= b;
		}
		
		System.out.println(d);
		
	}
}
