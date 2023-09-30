package baekjoon.q16139;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main2 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		int[][] arr = new int[s.length()][26];
		arr[0][s.charAt(0)-'a']++;
		
		for(int i=1; i<s.length(); i++) {
			int c = s.charAt(i) - 'a';
			for(int j=0; j<26; j++) arr[i][j] = arr[i-1][j];
			arr[i][c]++;
		}
		
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		int q = Integer.parseInt(br.readLine());
		char a;
		int r = 0, l = 0;
		for(int i=0; i<q; i++) {
			st = new StringTokenizer(br.readLine());
			a = st.nextToken().charAt(0);
			l = Integer.parseInt(st.nextToken());
			r = Integer.parseInt(st.nextToken());
			
			if(l == 0) sb.append(arr[r][a-'a']).append("\n");
			else sb.append(arr[r][a-'a'] - arr[l-1][a-'a']).append("\n");
		}
		br.close();
		
		System.out.println(sb.toString());
		
	}
}
