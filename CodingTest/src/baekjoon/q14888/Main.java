package baekjoon.q14888;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	
	public static int n;
	public static int[] numArr;
	public static int[] opArr = new int[4];
	public static int max = Integer.MIN_VALUE;
	public static int min = Integer.MAX_VALUE;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		
		numArr = new int[n];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0; i<n; i++) numArr[i] = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<4; i++) opArr[i] = Integer.parseInt(st.nextToken());
		br.close();
		
		dfs(numArr[0], 1);
		System.out.println(max);
		System.out.println(min);
	}

	private static void dfs(int num, int idx) {
		if(idx == n) {
			max = Math.max(max, num);
			min = Math.min(min, num);
			return;
		}
		for(int i=0; i<4; i++) {
			if(opArr[i] > 0) {
				opArr[i]--;
				switch(i) {
					case 0: dfs(num + numArr[idx], idx + 1); break;
					case 1: dfs(num - numArr[idx], idx + 1); break;
					case 2: dfs(num * numArr[idx], idx + 1); break;
					case 3: dfs(num / numArr[idx], idx + 1); break;
				}
				opArr[i]++;
			}
		}
	}
}
