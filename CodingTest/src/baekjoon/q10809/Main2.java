package baekjoon.q10809;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main2 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String s = br.readLine();
		
		for(char i='a'; i<='z'; i++) {
			sb.append(s.indexOf(i)).append(' ');
		}
		br.close();
		
		System.out.println(sb.toString());
		
	}
}
