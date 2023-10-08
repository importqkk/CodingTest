package baekjoon.q13305;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main2 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		long[] road = new long[n-1];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0; i<n-1; i++) road[i] = Long.parseLong(st.nextToken());
		
		long[] city = new long[n];
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<n; i++) city[i] = Long.parseLong(st.nextToken());
		br.close();

		long sum = 0;
		long min = city[0];
		
		for(int i=0; i<n-1; i++) {
			if(city[i] < min) min = city[i];
			sum += min * road[i];
		}
		
		System.out.println(sum);
		
	}
}
