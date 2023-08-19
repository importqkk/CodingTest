package baekjoon.q24723;
import java.io.IOException;

public class Main2 {
	public static void main(String[] args) throws IOException {
		
		int n = System.in.read() - 48;
		
		int sum = 1;
		while(n-- > 0) sum *= 2;
		
		System.out.println(sum);
		
	}
}
