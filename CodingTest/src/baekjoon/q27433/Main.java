package baekjoon.q27433;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		br.close();
		
		System.out.println(fact(n));
		
	}

	private static long fact(int n) {
		if(n <= 1) return 1;
		return fact(n - 1) * n;
	}
}
