package baekjoon.q2903;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int d = (int)Math.pow(2, n) + 1;
		
		System.out.println(d * d);
		
		br.close();
		
	}
}
