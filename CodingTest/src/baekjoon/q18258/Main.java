package baekjoon.q18258;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Deque<Integer> q = new LinkedList<>();
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		
		for(int i=0; i<n; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			String order = st.nextToken();
			
			switch(order) {
				case "push": {
					q.add(Integer.parseInt(st.nextToken())); break;
				}
				case "pop": {
					sb.append(q.isEmpty() ? -1 : q.poll()).append("\n"); break;
				}
				case "size": {
					sb.append(q.size()).append("\n"); break;
				}
				case "empty": {
					sb.append(q.isEmpty() ? 1 : 0).append("\n"); break;
				}
				case "front": {
					sb.append(q.isEmpty() ? -1 : q.peek()).append("\n"); break;
				}
				case "back": {
					sb.append(q.isEmpty() ? -1 : q.peekLast()).append("\n");
				}
			}
		}
		br.close();
		
		System.out.println(sb.toString());
		
	}
}
