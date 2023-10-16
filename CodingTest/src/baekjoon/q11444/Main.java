package baekjoon.q11444;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static long m = 1000000007;
	public static long[][] arr1 = {{1, 1}, {1, 0}};
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long n = Long.parseLong(br.readLine());
		br.close();
		
		long[][] arr2 = {{1, 1}, {1, 0}};
		System.out.println(calc(arr2, n-1)[0][0]);
		
	}

	private static long[][] calc(long[][] arr, long a) {
		if(a == 1 || a == 0) return arr;
		long[][] b = calc(arr, a/2);
		b = round(b, b);
		if(a % 2 == 1L) b = round(b, arr1);
		return b;
	}
	private static long[][] round(long[][] arr3, long[][] arr4) {
		long[][] b = new long[2][2];
		for(int i=0; i<2; i++) for(int j=0; j<2; j++) for(int k=0; k<2; k++) {
			b[j][k] += arr3[j][i] * arr4[i][k];
			b[j][k] %= m;
		}
		return b;
	}
}
