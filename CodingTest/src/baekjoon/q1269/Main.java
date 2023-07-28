package baekjoon.q1269;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

// 시간초과
public class Main {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		
		Map<Integer, Integer> map = new HashMap<>();
		List<Integer> list = new ArrayList<>();
		
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<a; i++) {
			int num1 = Integer.parseInt(st.nextToken());
			map.put(num1, 1);
			list.add(num1);
		}
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<b; i++) {
			int num2 = Integer.parseInt(st.nextToken());
			if(map.containsKey(num2)) list.remove(list.indexOf(num2));
			else list.add(num2);
		}
		br.close();
		
		System.out.println(list.size());
		
	}
}
