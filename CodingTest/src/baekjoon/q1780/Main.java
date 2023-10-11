package baekjoon.q1780;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static int mOne = 0, zero = 0, pOne = 0;
	public static int[][] arr;
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		arr = new int[n][n];
		StringTokenizer st;
		for(int i=0; i<n; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j=0; j<n; j++) arr[i][j] = Integer.parseInt(st.nextToken());
		}
		br.close();
		
		calc(0, 0, n);
		
		System.out.println(mOne);
		System.out.println(zero);
		System.out.println(pOne);
		
	}
	
	private static void calc(int row, int col, int size) {
		if(check(row, col, size)) {
			if(arr[row][col] == -1) mOne++;
			else if(arr[row][col] == 0) zero++;
			else pOne++;
			return;
		}
		int third = size / 3;
		calc(row, col, third);
		calc(row+third, col, third);
		calc(row, col+third, third);
		calc(row+third, col+third, third);
		calc(row+third+third, col, third);
		calc(row, col+third+third, third);
		calc(row+third, col+third+third, third);
		calc(row+third+third, col+third, third);
		calc(row+third+third, col+third+third, third);
	}
	private static boolean check(int row, int col, int size) {
		int num = arr[row][col];
		for(int i=row; i<row+size; i++) for(int j=col; j<col+size; j++) if(arr[i][j] != num) return false;
		return true;
	}
}
