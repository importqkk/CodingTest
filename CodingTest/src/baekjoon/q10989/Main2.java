package baekjoon.q10989;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// 메모리 초과
public class Main2 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		List<Integer> list = new ArrayList<>();
		
		for(int i=0; i<n; i++) {
			list.add(Integer.parseInt(br.readLine()));
		}
		br.close();
		
		Collections.sort(list);
		
		for(int i=0; i<n; i++) {
			sb.append(list.get(i)).append("\n");
		}
		
		System.out.println(sb.toString());
		
	}
}
