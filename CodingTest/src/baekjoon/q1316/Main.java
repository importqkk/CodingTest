package baekjoon.q1316;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		boolean[] a = new boolean[26];
		int cnt = n;
		
		for(int i=0; i<n; i++) {
			String s = br.readLine();
			
			Arrays.fill(a, false);
			a[s.charAt(0) - 'a'] = true;
			
			for(int j=1; j<s.length(); j++) {
				if(s.charAt(j) != s.charAt(j-1)) {
					if(a[s.charAt(j) - 'a'] == true) {
						cnt--;
						break;
					}
					else a[s.charAt(j) - 'a'] = true;
				}
			}
		}
		
		br.close();
		
		System.out.println(cnt);
		
	}
}
