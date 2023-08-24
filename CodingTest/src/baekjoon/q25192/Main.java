package baekjoon.q25192;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Main {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		Set<String> set = new HashSet<>();
		
		int cnt = 0;
		while(n-- > 0) {
			String msg = br.readLine();
			if(msg.equals("ENTER")) {
				cnt += set.size();
				set.clear();
				continue;
			}
			set.add(msg);
		}
		br.close();
		
		System.out.println(cnt + set.size());
		
	}
}
