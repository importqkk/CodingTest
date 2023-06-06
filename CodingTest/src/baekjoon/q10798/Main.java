package baekjoon.q10798;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		char[][] arr = new char[5][15];
		int max = 0;
		
		for(int i=0; i<5; i++) {
			String s = br.readLine();
			max = Math.max(max, s.length());
			
			for(int j=0; j<s.length(); j++) {
				arr[i][j] = s.charAt(j);
			}
		}
		
		br.close();
		
		for(int i=0; i<max; i++) {
			for(int j=0; j<5; j++) {
				if(arr[j][i] == '\0') continue;
				System.out.print(arr[j][i]);
			}
		}
		
	}
}
