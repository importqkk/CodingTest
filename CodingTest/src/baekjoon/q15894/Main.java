package baekjoon.q15894;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long n = Integer.parseInt(br.readLine());
		br.close();
		
		long col = n * 2;
		long row = n * 2;
		
		System.out.println(col + row);
		
	}
}
