package baekjoon.q24511;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		LinkedList<Integer> qs = new LinkedList<>();
		StringTokenizer isQs = new StringTokenizer(br.readLine(), " ");
		StringTokenizer num = new StringTokenizer(br.readLine(), " ");
		
		for(int i=0; i<n; i++) {
			int add = Integer.parseInt(num.nextToken());
			if(Integer.parseInt(isQs.nextToken()) == 0) {
				qs.add(add);
			}
		}
		
		int m = Integer.parseInt(br.readLine());
		num = new StringTokenizer(br.readLine(), " ");
		StringBuilder sb = new StringBuilder();
		
		for(int i=0; i<m; i++) {
			qs.addFirst(Integer.parseInt(num.nextToken()));
			sb.append(qs.pollLast()).append(" ");
		}
		br.close();
		
		System.out.println(sb.toString());
		
	}
}
