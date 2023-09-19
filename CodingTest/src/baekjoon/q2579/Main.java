package baekjoon.q2579;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	private static int[] step;
	private static Integer[] point;
	private static int n;
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		step = new int[n+1];
		point = new Integer[n+1];
		for(int i=1; i<=n; i++) step[i] = Integer.parseInt(br.readLine());
		br.close();
		
		point[0] = step[0];
		point[1] = step[1];
		if(n >= 2) point[2] = step[1] + step[2];
		
		System.out.println(calc(n));
		
	}

	private static int calc(int n) {
		if(point[n] == null) {
			point[n] = Math.max(calc(n-2), calc(n-3)+step[n-1]) + step[n];
		}
		return point[n];
	}
}
