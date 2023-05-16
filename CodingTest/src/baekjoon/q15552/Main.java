package baekjoon.q15552;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int t = Integer.parseInt(r.readLine());
		StringTokenizer st;
		
		for(int i = 0; i < t; i++) {
			st = new StringTokenizer(r.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			w.write((a+b) + "\n");
		}
		
		r.close();
		
		w.flush();
		w.close();
		
	}
}
