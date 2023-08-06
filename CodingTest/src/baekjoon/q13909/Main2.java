package baekjoon.q13909;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main2 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		br.close();
		
		int cnt = 0;
		for(int i=1; i*i<=n; i++) {
			cnt++;
		}
		
		System.out.println(cnt);
		
	}
}
