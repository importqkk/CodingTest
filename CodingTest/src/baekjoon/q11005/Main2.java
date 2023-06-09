package baekjoon.q11005;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main2 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int n = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		br.close();
		
		System.out.println(Integer.toString(n, b).toUpperCase());
		
	}
}
