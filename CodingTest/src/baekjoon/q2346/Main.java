package baekjoon.q2346;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		
		ArrayDeque<int[]> d = new ArrayDeque<>();
		StringBuilder sb = new StringBuilder();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int[] arr = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		sb.append(1).append(" ");
		int num = arr[0];
		
		for(int i=1; i<n; i++) {
			d.add(new int[] {i+1, arr[i]});
		}
		
		while(!d.isEmpty()) {
			if(num > 0) {
				for(int i=0; i<num-1; i++) {
					d.add(d.poll());
				}
				int[] arr2 = d.poll();
				num = arr2[1];
				sb.append(arr2[0]).append(" ");
			}
			else {
				for(int i=0; i<-num-1; i++) {
					d.addFirst(d.pollLast());
				}
				int[] arr2 = d.pollLast();
				num = arr2[1];
				sb.append(arr2[0]).append(" ");
			}
		}
		
		System.out.println(sb.toString());
		
	}
}
