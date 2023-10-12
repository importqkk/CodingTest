package baekjoon.q1629;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static long c;
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		long a = Long.parseLong(st.nextToken());
		long b = Long.parseLong(st.nextToken());
		c = Long.parseLong(st.nextToken());
		br.close();
		
		System.out.println(calc(a, b));
		
	}

	private static long calc(long a, long b) {
		if(b == 1) return a % c;
		long tmp = calc(a, b/2);
		if(b % 2 == 1) return (tmp * tmp % c) * a % c;
		return tmp * tmp % c;
	}
}
