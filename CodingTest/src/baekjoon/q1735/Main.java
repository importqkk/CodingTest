package baekjoon.q1735;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int a1 = Integer.parseInt(st.nextToken());
		int a2 = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		int b1 = Integer.parseInt(st.nextToken());
		int b2 = Integer.parseInt(st.nextToken());
		br.close();
		
		int c1 = (a1 * b2) + (a2 * b1);
		int c2 = a2 * b2;
		int gcd = gcd(c1, c2);
		
		StringBuilder sb = new StringBuilder();
		sb.append(c1 / gcd).append(" ").append(c2 / gcd);
		System.out.println(sb.toString());
		
	}

	private static int gcd(int c1, int c2) {
		if(c1 % c2 == 0) return c2;
		else return gcd(c2, c1 % c2);
	}
}
