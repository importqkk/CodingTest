package baekjoon.q10101;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main2 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(br.readLine());
		int b = Integer.parseInt(br.readLine());
		int c = Integer.parseInt(br.readLine());
		br.close();

		if(a + b + c != 180) System.out.println("Error");
		else {
			if(a == 60 && b == 60) System.out.println("Equilateral");
			else if(a == b || a == c || b == c) System.out.println("Isosceles");
			else System.out.println("Scalene");
		}
		
	}
}
