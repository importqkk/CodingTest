package baekjoon.q11729;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int cnt = hanoi(n, 1, 2, 3, 0, sb);
		br.close();
		
		System.out.println(String.valueOf(cnt));
		System.out.println(sb.toString());
		
	}

	static StringBuilder sb = new StringBuilder();
	private static int hanoi(int n, int start, int sub, int to, int cnt, StringBuilder sb) {
		cnt++;
		if(n == 1) {
			sb.append(start).append(" ").append(to).append("\n");
			return cnt;
		}
		cnt = hanoi(n-1, start, to, sub, cnt, sb);
		sb.append(start).append(" ").append(to).append("\n");
		cnt = hanoi(n-1, sub, start, to, cnt, sb);
		return cnt;
	}
}
