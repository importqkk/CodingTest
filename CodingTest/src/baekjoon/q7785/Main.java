package baekjoon.q7785;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		Set<String> set = new HashSet<>();
		StringTokenizer st;
		for(int i=0; i<n; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			String name = st.nextToken();
			String state = st.nextToken();
			if(state.equals("enter")) set.add(name);
			else set.remove(name);
		}
		br.close();
		
		ArrayList<String> list = new ArrayList<>(set);
		Collections.sort(list, Collections.reverseOrder());
		
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<list.size(); i++) {
			sb.append(list.get(i)).append("\n");
		}
		System.out.println(sb);
		
	}
}
