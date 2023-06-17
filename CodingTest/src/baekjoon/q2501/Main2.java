package baekjoon.q2501;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main2 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		br.close();
		
		int cnt = 0;

		for(int i=1; i<=n; i++) {
			if(n % i == 0) {
				cnt++;
				if(k == cnt) System.out.println(i);
			}
		}
		if(cnt < k) System.out.println(0);
		
	}
}
