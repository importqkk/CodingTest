package baekjoon.q11054;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	private static int n;
	private static int[] a, dp1, dp2;
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		a = new int[n]; dp1 = new int[n]; dp2 = new int[n];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0; i<n; i++) a[i] = Integer.parseInt(st.nextToken());
		br.close();
		
		lis(); lds();
		
		int max = 0;
		for(int i=0; i<n; i++) if(max < dp1[i] + dp2[i]) max = dp1[i] + dp2[i];
		
		System.out.println(max - 1);
		
	}
	
	private static void lis() {
		for(int i=0; i<n; i++) {
			dp1[i] = 1;
			for(int j=0; j<i; j++) if(a[j]<a[i] && dp1[i]<dp1[j]+1) dp1[i]=dp1[j]+1;
		}
	}
	private static void lds() {
		for(int i=n-1; i>=0; i--) {
			dp2[i] = 1;
			for(int j=n-1; j>i; j--) if(a[j]<a[i] && dp2[i]<dp2[j]+1) dp2[i]=dp2[j]+1;
		}
	}
}
