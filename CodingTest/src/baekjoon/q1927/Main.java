package baekjoon.q1927;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class Main {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		PriorityQueue<Integer> heap = new PriorityQueue<>();
		StringBuilder sb = new StringBuilder();
		int x;
		for(int i=0; i<n; i++) {
			x = Integer.parseInt(br.readLine());
			if(x == 0) {
				if(heap.isEmpty()) sb.append(0).append("\n");
				else sb.append(heap.poll()).append("\n");
			} else heap.add(x);
		}
		br.close();
		
		System.out.println(sb.toString());
		
	}
}
