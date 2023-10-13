package baekjoon.q11401;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static long num = 1000000007;
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		long n=Long.parseLong(st.nextToken()), k=Long.parseLong(st.nextToken());
		br.close();
		
		long a = fact(n);
		long b = fact(k) * fact(n-k) % num;
		
		System.out.println(a * calc(b, num-2) % num);
		
	}
	
	private static long fact(long n) {
		long f = 1L;
		while(n > 1) {
			f = (f * n) % num;
			n--;
		}
		return f;
	}
	private static long calc(long b, long l) {
		if(l == 1) return b % num;
		long tmp = calc(b, l/2);
		if(l % 2 == 1) return (tmp * tmp % num) * b % num;
		return tmp * tmp % num;
	}
	
}
