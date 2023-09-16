package baekjoon.q1912;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	
	private static int[] numArr;
	private static Integer[] sumArr;
	private static int max = Integer.MIN_VALUE;
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		numArr = new int[n];
		sumArr = new Integer[n];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0; i<n; i++) numArr[i] = Integer.parseInt(st.nextToken());
		br.close();
		
		sumArr[0] = numArr[0];
		max = sumArr[0];
		sum(n-1);
		
		System.out.println(max);
		
	}

	private static int sum(int i) {
		if(sumArr[i] == null) {
			sumArr[i] = Math.max(sum(i-1) + numArr[i], numArr[i]);
			max = Math.max(max, sumArr[i]);
		}
		return sumArr[i];
	}
}
