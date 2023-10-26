package baekjoon.q11286;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Main {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		PriorityQueue<Integer> heap = new PriorityQueue<>(new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				int absO1 = Math.abs(o1), absO2 = Math.abs(o2);
				if(absO1 > absO2) return 1;
				else if(absO1 == absO2) {
					if(o1 > o2) return 1;
					else return -1;
				} else return -1;
			}
		});
		
		int x;
		StringBuilder sb = new StringBuilder();
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
