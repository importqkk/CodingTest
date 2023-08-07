package baekjoon.q28278;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		Stack<Integer> s = new Stack<>();
		StringBuilder sb = new StringBuilder();
		
		for(int i=0; i<n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int o = Integer.parseInt(st.nextToken());
			if(o == 1) {
				int push = Integer.parseInt(st.nextToken());
				s.push(push);
				continue;
			}
			if(o == 2) {
				if(!s.empty()) sb.append(s.pop()).append("\n");
				else sb.append(-1).append("\n");
			}
			else if(o == 3) {
				sb.append(s.size()).append("\n");
			}
			else if(o == 4) {
				if(s.empty()) sb.append(1).append("\n");
				else sb.append(0).append("\n");
			}
			else {
				if(!s.empty()) sb.append(s.peek()).append("\n");
				else sb.append(-1).append("\n");
			}
		}
		br.close();
		
		System.out.println(sb.toString());
		
	}
}
