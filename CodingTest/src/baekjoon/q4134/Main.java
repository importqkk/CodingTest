package baekjoon.q4134;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

// https://velog.io/@gayeong39/%EB%B0%B1%EC%A4%80-4134-%EB%8B%A4%EC%9D%8C-%EC%86%8C%EC%88%98-JAVA
public class Main {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int c = Integer.parseInt(br.readLine());
		long[] arr = new long[c];
		for(int i=0; i<c; i++) {
			arr[i] = Long.parseLong(br.readLine());
		}
		br.close();
		
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<c; i++) {
			BigInteger num = new BigInteger(String.valueOf(arr[i]));
			if(num.isProbablePrime(10)) sb.append(num).append("\n");
			else sb.append(num.nextProbablePrime()).append("\n");
		}
		
		System.out.println(sb.toString());
		
	}
}
