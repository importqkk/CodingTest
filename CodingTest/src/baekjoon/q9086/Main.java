package baekjoon.q9086;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int t = Integer.parseInt(br.readLine());
		for(int i=0; i<t; i++) {
			String w = br.readLine();
			sb.append(w.charAt(0)).append(w.charAt(w.length()-1)).append("\n");
		}
		br.close();
		
		System.out.println(sb.toString());
		
	}
}
