package baekjoon.q10988;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main2 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder(br.readLine());
		br.close();
		
		String o = sb.toString();
		String r = sb.reverse().toString();
		
		System.out.println(o.equals(r) ? 1 : 0);
		
	}
}
