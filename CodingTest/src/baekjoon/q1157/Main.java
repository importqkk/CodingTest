package baekjoon.q1157;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine().toUpperCase();
		br.close();
		
		int[] arr = new int[26];
		for(int i=0; i<s.length(); i++) {
			arr[s.charAt(i) - 'A']++;
		}
		
		int max = -1;
		char q = '?';
		for(int i=0; i<arr.length; i++) {
			if(arr[i] > max) {
				max = arr[i];
				q = (char)(i+'A');
			}
			else if(arr[i] == max) q = '?';
		}
		
		System.out.println(q);
		
	}
}
