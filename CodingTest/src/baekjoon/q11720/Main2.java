package baekjoon.q11720;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main2 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		String num = br.readLine();
		br.close();
		
		int sum = 0;
		for(int i=0; i<n; i++) {
			sum += Character.getNumericValue(num.charAt(i));
		}
		
		System.out.println(sum);
		
	}
}
