package baekjoon.q5597;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main2 {
	public static void main(String[] args) throws IOException {
		
		boolean[] arr = new boolean[31];
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		for(int i=0; i<28; i++) {
			arr[Integer.parseInt(br.readLine())] = true;
		}
		br.close();
		
		for(int i=1; i <= 30; i++) {
			if(!arr[i]) sb.append(i).append("\n");
		}
		System.out.println(sb);
		
	}
}
