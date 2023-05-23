package baekjoon.q10809;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		char[] arr = {
						'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 
						'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 
						's', 't', 'u', 'v', 'w', 'x', 'y', 'z'
					};
		String s = br.readLine();
		
		for(int i=0; i<arr.length; i++) {
			sb.append(s.indexOf(arr[i])).append(' ');
		}
		br.close();
		
		System.out.println(sb.toString());
		
	}
}
