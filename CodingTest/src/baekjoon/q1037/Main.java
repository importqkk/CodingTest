package baekjoon.q1037;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int cnt = Integer.parseInt(br.readLine());
		int[] arr = new int[cnt];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0; i<cnt; i++) arr[i] = Integer.parseInt(st.nextToken());
		br.close();
		
		Arrays.sort(arr);
		if(arr.length == 1) System.out.println(arr[0] * arr[0]);
		else System.out.println(arr[0] * arr[arr.length-1]);
		
	}
}
