package baekjoon.q5597;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		
		int[] arr = new int[30];
		for(int i = 1; i <= 30; i++) {
			arr[i-1] = i;
		}
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		List<Integer> list = new ArrayList<>();
		for(int i = 0; i < 28; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), "\n");
			int n = Integer.parseInt(st.nextToken());
			list.add(n);
		}
		br.close();
		
		for(int i = 0; i < arr.length; i++) {
			if(!list.contains(arr[i])) System.out.println(arr[i]);
		}
		
	}
}
