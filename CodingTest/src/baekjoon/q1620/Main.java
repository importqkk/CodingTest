package baekjoon.q1620;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		Map<Integer, String> noMap = new HashMap<>();
		Map<String, Integer> nameMap = new HashMap<>();
		for(int i=1; i<=n; i++) {
			String name = br.readLine();
			noMap.put(i, name);
			nameMap.put(name, i);
		}
		
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<m; i++) {
			String search = br.readLine();
			if(search.charAt(0) >= 48 && search.charAt(0) <= 57) 
				sb.append(noMap.get(Integer.parseInt(search))).append("\n");
			else sb.append(nameMap.get(search)).append("\n");
		}
		br.close();
		
		System.out.println(sb);
		
	}
	
}
