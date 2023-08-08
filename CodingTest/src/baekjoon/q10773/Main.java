package baekjoon.q10773;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int k = Integer.parseInt(br.readLine());
		Stack<Integer> s = new Stack<>();
		
		for(int i=0; i<k; i++) {
			int n = Integer.parseInt(br.readLine());
			if(n == 0) s.pop();
			else s.push(n);
		}
		br.close();
		
		int sum = 0;
		for(int i=0; i<s.size(); i++) {
			sum += s.get(i);
		}
		System.out.println(sum);
		
	}
}
