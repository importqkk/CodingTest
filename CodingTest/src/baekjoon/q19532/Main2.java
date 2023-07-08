package baekjoon.q19532;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main2 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int a = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken()), 
			c = Integer.parseInt(st.nextToken()), d = Integer.parseInt(st.nextToken()),
			e = Integer.parseInt(st.nextToken()), f = Integer.parseInt(st.nextToken());
		br.close();
		StringBuilder sb = new StringBuilder();
		
		int x = (c*e - b*f) / (a*e - b*d);
		int y = (c*d - a*f) / (b*d - a*e);
		
		sb.append(x).append(" ").append(y);
		System.out.println(sb.toString());
		
	}
}
