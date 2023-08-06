package baekjoon.q13909;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 메모리 초과
public class Main {
	public static void main(String[] args) throws IOException {
		
		boolean[] arr = new boolean[2100000001];
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		br.close();
		
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n; j++) {
				if(arr[i*j]) arr[i*j] = false;
				else arr[i*j] = true;
			}
		}
		
		int cnt = 0;
		for(int i=1; i<=n; i++) {
			if(arr[i]) cnt++;
		}
		
		System.out.println(cnt);
		
	}
}
