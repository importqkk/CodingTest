package baekjoon.q2292;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		br.close();
		
		int min = 1;
		int round = 1;

		while(round < n) {
			round = round + (6 * min);
			min++;
		}
		System.out.println(min);
		
	}
}
