package baekjoon.q12789;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		Queue<Integer> q = new LinkedList<>();
		Stack<Integer> s = new Stack<>();
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		for(int i=0; i<n; i++) {
			q.offer(Integer.parseInt(st.nextToken()));
		}
		br.close();
		
		int order = 1;
		while(!q.isEmpty()) {
			if(q.peek() == order) {
				q.poll(); order++;
			}
			else if(!s.isEmpty() && s.peek() == order) {
				s.pop(); order++;
			}
			else s.push(q.poll());
		}
		while(!s.isEmpty()) {
			if(s.peek() == order) {
				s.pop(); order++;
			}
			else {
				System.out.println("Sad"); return;
			}
		}
		
		System.out.println("Nice");
		
	}
}
