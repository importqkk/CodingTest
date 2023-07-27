package baekjoon.q1764;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		Map<String, Integer> map = new HashMap<>();
		List<String> list = new ArrayList<>();
		
		for(int i=0; i<n; i++) map.put(br.readLine(), 1);
		for(int i=0; i<m; i++) {
			String name = br.readLine();
			if(map.containsKey(name)) {
				map.put(name, 2);
				list.add(name);
			}
		}
		br.close();
		
		Collections.sort(list);
		StringBuilder sb = new StringBuilder();
		
		sb.append(list.size());
		for(String l : list) {
			sb.append("\n").append(l);
		}
		
		System.out.println(sb.toString());
		
	}
}
