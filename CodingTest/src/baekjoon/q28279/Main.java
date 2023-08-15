package baekjoon.q28279;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		
		Deque<Integer> d = new LinkedList<>();
		StringBuilder sb = new StringBuilder();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st;

		while(n-- > 0) {
			st = new StringTokenizer(br.readLine());
			int order = Integer.parseInt(st.nextToken());
			
			switch(order) {
				case 1: {
					d.addFirst(Integer.parseInt(st.nextToken())); break;
				}
				case 2: {
					d.addLast(Integer.parseInt(st.nextToken())); break;
				}
				case 3: {
					sb.append(d.isEmpty() ? -1 : d.pollFirst()).append("\n"); break;
				}
				case 4: {
					sb.append(d.isEmpty() ? -1 : d.pollLast()).append("\n"); break;
				}
				case 5: {
					sb.append(d.size()).append("\n"); break;
				}
				case 6: {
					sb.append(d.isEmpty() ? 1 : 0).append("\n"); break;
				}
				case 7: {
					sb.append(d.isEmpty() ? -1 : d.peekFirst()).append("\n"); break;
				}
				case 8: {
					sb.append(d.isEmpty() ? -1 : d.peekLast()).append("\n"); break;
				}
			}
		}
		br.close();
		
		System.out.println(sb.toString());
		
	}
}
