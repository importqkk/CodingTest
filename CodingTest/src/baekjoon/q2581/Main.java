package baekjoon.q2581;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) throws IOException {
		
		StringBuilder sb = new StringBuilder();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int m = Integer.parseInt(br.readLine());
		int n = Integer.parseInt(br.readLine());
		br.close();
		
		List<Integer> list = new ArrayList<>();
		
		for(int i=m; i<=n; i++) {
			int num = i;
			int cnt = 0;
			for(int j=1; j<=num; j++) {
				if(num % j == 0) cnt++;
			}
			if(cnt == 2) {
				list.add(num);
			}
		}
		
		int sum = 0;
		for(int i=0; i<list.size(); i++) {
			sum += list.get(i);
		}
		
		if(list.size() == 0) System.out.println(-1);
		else {
			sb.append(sum).append("\n").append(list.get(0));
			System.out.println(sb.toString());
		}
		
	}
}
