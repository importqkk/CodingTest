package baekjoon.q10815;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

// 시간초과
public class Main2 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		for(int i=0; i<n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		int m = Integer.parseInt(br.readLine());
		int[] newArr = new int[m];
		st = new StringTokenizer(br.readLine(), " ");
		for(int i=0; i<m; i++) {
			newArr[i] = Integer.parseInt(st.nextToken());
		}
		br.close();
		
		Map<Integer, Integer> map = new HashMap<>();
		int contain;
		for(int i=0; i<m; i++) {
			contain = 0;
			for(int j=0; j<n; j++) {
				if(newArr[i] == arr[j]) {
					contain = 1; map.put(newArr[i], contain);
				}
				else map.put(newArr[i], contain);
			}
		}
		
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<newArr.length; i++) {
			sb.append(map.get(newArr[i])).append(" ");
		}
		System.out.println(sb.toString());
		
	}
}
