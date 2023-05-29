package baekjoon.q10988;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder(br.readLine());
		br.close();
		
		String o = sb.toString();
		String r = sb.reverse().toString();
		
		boolean check = true;
		for(int i=0; i<o.length(); i++) {
			if(o.charAt(i) != r.charAt(i)) {
				check = false;
				break;
			}
		}
		
		System.out.println(check ? 1 : 0);
		
	}
}
