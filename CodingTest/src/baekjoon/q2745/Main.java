package baekjoon.q2745;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		String n = st.nextToken();
		int b = Integer.parseInt(st.nextToken());
		
		long ans = 0;
		int sq = 0;
		int num = 0;
		
		for(int i = n.length()-1; i >= 0; i--) {
			char c = n.charAt(i);
			if(c >= '0' && c <= '9') num = c - 48;
			else num = c - 55;
			ans += num * Math.pow(b, sq++);
		}
		
		br.close();
		
		System.out.println(ans);
		
	}
}
