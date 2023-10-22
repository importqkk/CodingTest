package baekjoon.q1300;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine()), k = Integer.parseInt(br.readLine());
		br.close();
		
		long start = 1, end = k, half, cnt;
		while(start < end) {
			half = (start + end) / 2;
			cnt = 0;
			for(int i=1; i<=n; i++) cnt += Math.min(half/i, n);
			if(k <= cnt) end = half;
			else start = half + 1;
		}
		System.out.println(start);
		
	}
}
