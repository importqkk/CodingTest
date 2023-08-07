package baekjoon.q28278;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main2 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		Stack<Integer> s = new Stack<>();
		StringBuilder sb = new StringBuilder();
		
		for(int i=0; i<n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int o = Integer.parseInt(st.nextToken());
			
			switch(o) {
			case 1: {
				s.push(Integer.parseInt(st.nextToken())); break;
			}
			case 2: {
				sb.append(!s.empty() ? s.pop() : -1).append("\n"); break;
			}
			case 3: {
				sb.append(s.size()).append("\n"); break;
			}
			case 4: {
				sb.append(s.empty() ? 1 : 0).append("\n"); break;
			}
			default:
				sb.append(!s.empty() ? s.peek() : -1).append("\n"); break;
			}
		}
		br.close();
		
		System.out.println(sb.toString());
		
	}
}
