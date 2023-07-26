package baekjoon.q10816;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		Map<Integer, Integer> map = new HashMap<>();
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0; i<n; i++) {
			int num = Integer.parseInt(st.nextToken());
			if(!map.containsKey(num)) map.put(num, 1);
			else map.put(num, map.get(num) + 1);
		}
		
		int m = Integer.parseInt(br.readLine());
		
		st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<m; i++) {
			int search = Integer.parseInt(st.nextToken());
			if(map.get(search) != null) sb.append(map.get(search)).append(" ");
			else sb.append(0).append(" ");
		}
		
		br.close();
		
		System.out.println(sb.toString());
		
	}
}
