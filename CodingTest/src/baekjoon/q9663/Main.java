package baekjoon.q9663;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://st-lab.tistory.com/118
public class Main {
	
	public static int n;
	public static int[] arr;
	public static int cnt = 0;
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		br.close();
		
		arr = new int[n];
		nQueen(0);
		System.out.println(cnt);
		
	}

	private static void nQueen(int depth) {
		if(depth == n) {
			cnt++;
			return;
		}
		for(int i=0; i<n; i++) {
			arr[depth] = i;
			if(isPossible(depth)) {
				nQueen(depth + 1);
			}
		}
	}

	private static boolean isPossible(int col) {
		for(int i=0; i<col; i++) {
			if(arr[col] == arr[i]) return false;
			else if(Math.abs(col - i) == Math.abs(arr[col] - arr[i])) return false;
		}
		return true;
	}
}
