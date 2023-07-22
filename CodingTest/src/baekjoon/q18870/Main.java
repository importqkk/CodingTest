package baekjoon.q18870;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		int[] sort = new int[n];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0; i<n; i++) {
			arr[i] = sort[i] = Integer.parseInt(st.nextToken());
		}
		br.close();
		
		Arrays.sort(sort);
		Map<Integer, Integer> map = new HashMap<>();
		int order = 0;
		for(int i=0; i<n; i++) {
			if(!map.containsKey(sort[i])) {
				map.put(sort[i], order); order++;
			}
		}
		
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<n; i++) {
			sb.append(map.get(arr[i])).append(" ");
		}
		System.out.println(sb);
		
	}
}
