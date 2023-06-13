package baekjoon.q1193;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int x = Integer.parseInt(br.readLine());
		br.close();
		
		int cross = 1;
		
		while(x > cross) {
			x -= cross;
			cross++;
		}
		
		if(cross % 2 == 0) System.out.println(x + "/" + (cross - x + 1));
		else System.out.println((cross - x + 1) + "/" + x);
		
	}
}
