package baekjoon.q10815;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		for(int i=0; i<n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(arr);
		
		int m = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine(), " ");
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<m; i++) {
			int num = Integer.parseInt(st.nextToken());
			sb.append(binSearch(arr, num)).append(" ");
		}
		br.close();
		
		System.out.println(sb);
		
	}

	
	private static int binSearch(int[] arr, int num) {
		
		int first = 0;
		int last = arr.length - 1;
		int mid = 0;
		
		while(first <= last) {
			mid = (first + last) / 2;
			if(arr[mid] == num) return 1;
			if(arr[mid] < num) first = mid + 1;
			else last = mid - 1;
		}
		
		return 0;
		
	}
	
}
