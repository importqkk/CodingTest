package baekjoon.q9012;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		for(int i=0; i<t; i++) {
			Stack<Character> s = new Stack<>();
			String str = br.readLine();
			
			for(int j=0; j<str.length(); j++) {
				char c = str.charAt(j);
				if(c == '(') s.push(c);
				else {
					if(s.isEmpty()) {
						s.push(c); break;
					}
					else s.pop();
				}
			}
			
			if(s.isEmpty()) sb.append("YES").append("\n");
			else sb.append("NO").append("\n");
		}
		br.close();
		
		System.out.println(sb);
		
	}
}
