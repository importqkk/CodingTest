package baekjoon.q1546;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		int[] scores = new int[n];
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		for(int i=0; i<n; i++) {
			scores[i] = Integer.parseInt(st.nextToken());
		}
		br.close();
		
		Arrays.sort(scores);
		double max = scores[n-1];
		
		double sum = 0;
		for(int i=0; i<scores.length; i++) {
			sum += scores[i];
		}
		double avg = sum / n;
		
		System.out.println(avg / max * 100);
		
	}
}
