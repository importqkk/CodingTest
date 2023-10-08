package baekjoon.q13305;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 85점
public class Main {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		int[] road = new int[n-1];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0; i<n-1; i++) road[i] = Integer.parseInt(st.nextToken());
		
		int[] city = new int[n];
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<n; i++) city[i] = Integer.parseInt(st.nextToken());
		br.close();

		int sum = 0;
		int min = city[0];
		
		for(int i=0; i<n-1; i++) {
			if(city[i] < min) min = city[i];
			sum += min * road[i];
		}
		
		System.out.println(sum);
		
	}
}
