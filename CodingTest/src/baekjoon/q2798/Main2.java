package baekjoon.q2798;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main2 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		int[] arr = new int[n];
		st = new StringTokenizer(br.readLine(), " ");
		for(int i=0; i<n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		br.close();
		
		int ans = calc(n, m, arr);
		System.out.println(ans);
		
	}

	private static int calc(int n, int m, int[] arr) {
		int max = 0;
		for(int i=0; i<n-2; i++) {
			for(int j=i+1; j<n-1; j++) {
				for(int k=j+1; k<n; k++) {
					int sum = arr[i] + arr[j] + arr[k];
					if(sum == m) {
						return sum;
					}
					if(sum > max && sum < m) max = sum;
				}
			}
		}
		return max;
	}
	
}
