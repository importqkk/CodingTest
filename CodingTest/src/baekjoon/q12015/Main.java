package baekjoon.q12015;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] a = new int[n];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0; i<n; i++) a[i] = Integer.parseInt(st.nextToken());
		br.close();
		
		int[] arr = new int[n];
		arr[0] = a[0];
		int idx = 1, num, s, e, half;
		for(int i=1; i<n; i++) {
			num = a[i];
			if(arr[idx - 1] < num) {
				idx++;
				arr[idx - 1] = num;
			} else {
				s = 0;
				e = idx;
				while(s < e) {
					half = (s + e) / 2;
					if(arr[half] < num) s = half + 1;
					else e = half;
				}
				arr[s] = num;
			}
		}
		
		System.out.println(idx);
	
	}
}
