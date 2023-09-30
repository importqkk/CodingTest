package baekjoon.q16139;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	private static String s;
	private static StringBuilder sb = new StringBuilder();
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		s = br.readLine();
		int q = Integer.parseInt(br.readLine());
		
		int i = 0, l = 0;
		StringTokenizer st;
		for(int j=0; j<q; j++) {
			st = new StringTokenizer(br.readLine());
			char a = st.nextToken().charAt(0);
			i = Integer.parseInt(st.nextToken());
			l = Integer.parseInt(st.nextToken());
			find(a, i, l);
		}
		br.close();
		
		System.out.println(sb.toString());
		
	}

	private static void find(char a, int i, int l) {
		String sub = s.substring(i, l+1);
		int cnt = 0;
		for(int j=0; j<sub.length(); j++) if(sub.charAt(j) == a) cnt++;
		sb.append(cnt).append("\n");
	}
}
