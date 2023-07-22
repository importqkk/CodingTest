package baekjoon.q18870;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;
import java.util.stream.Collectors;

// 시간초과
public class Main2 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		List<Integer> list = new ArrayList<>();
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0; i<n; i++) {
			list.add(Integer.parseInt(st.nextToken()));
		}
		br.close();
		
		List<Integer> sort = list.stream().distinct().collect(Collectors.toList());
		Collections.sort(sort);
		
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<list.size(); i++) {
			sb.append(sort.indexOf(list.get(i))).append(" ");
		}
		System.out.println(sb);
		
	}
}
