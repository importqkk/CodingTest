package baekjoon.q14215;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		
		int[] arr = new int[3];
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		arr[0] = Integer.parseInt(st.nextToken());
		arr[1] = Integer.parseInt(st.nextToken());
		arr[2] = Integer.parseInt(st.nextToken());
		br.close();
		
		Arrays.sort(arr);
		if(arr[0] + arr[1] > arr[2]) System.out.println(arr[0] + arr[1] + arr[2]);
		else {
			arr[2] = arr[0] + arr[1] - 1;
			System.out.println(arr[0] + arr[1] + arr[2]);
		}
		
	}
}
