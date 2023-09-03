package baekjoon.q10870;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		br.close();
		
		System.out.println(fib(n));
		
	}

	private static int fib(int n) {
		if(n == 0) return 0;
		if(n == 1) return 1;
		return fib(n-1) + fib(n-2);
	}
}