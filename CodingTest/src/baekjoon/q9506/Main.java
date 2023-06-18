package baekjoon.q9506;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) throws IOException {
		
		StringBuilder sb = new StringBuilder();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while(true) {
			int n = Integer.parseInt(br.readLine());
			if(n == -1) break;
			
			List<Integer> list = new ArrayList<>();
			sb.append(n).append(" ");
			
			int sum = 0;
			for(int i=1; i<=n; i++) {
				if(n % i == 0 && n != i) {
					list.add(i);
					sum += i;
				}
			}
			
			if(sum == n) {
				sb.append("= ");
				for(int i=0; i<list.size(); i++) {
					int num = list.get(i);
					if(list.indexOf(num) == list.size() - 1) {
						sb.append(num).append("\n");
					}
					else {
						sb.append(num).append(" ").append("+ ");
					}
				}
			}
			else {
				sb.append("is NOT perfect.").append("\n");
			}
		}
		
		br.close();
		
		System.out.println(sb.toString());
		
	}
}
