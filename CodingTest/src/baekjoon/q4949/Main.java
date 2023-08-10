package baekjoon.q4949;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		while(true) {
			String str = br.readLine();
			if(str.equals(".")) break;
			
			Stack<Character> s = new Stack<>();
			
			for(int i=0; i<str.length(); i++) {
				char c = str.charAt(i);
				if(c == '(' || c == '[') s.push(c);
				else if(c == ')') {
					if(s.isEmpty() || s.peek() != '(') {
						s.push(c); break;
					}
					else s.pop();
				}
				else if(c == ']') {
					if(s.isEmpty() || s.peek() != '[') {
						s.push(c); break;
					}
					else s.pop();
				}
			}
			
			if(s.isEmpty()) sb.append("yes").append("\n");
			else sb.append("no").append("\n");
		}
		br.close();
		
		System.out.println(sb);
		
	}
}
