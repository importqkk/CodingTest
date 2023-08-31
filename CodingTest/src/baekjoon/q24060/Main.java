package baekjoon.q24060;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int n = Integer.parseInt(st.nextToken());
		k = Integer.parseInt(st.nextToken());
		
		a = new int[n];
		st = new StringTokenizer(br.readLine(), " ");
		for(int i=0; i<n; i++) {
			a[i] = Integer.parseInt(st.nextToken());
		}
		br.close();
		
		temp = new int[n];
		mergeSort(a, 0, n-1);
		System.out.println(result);
		
	}
	
	static int[] a, temp;
	static int cnt = 0;
	static int result = -1;
	static int k;
	
	public static void mergeSort(int[] a, int p, int r) {
		if(cnt > k) return;
		if(p < r) {
			int q = (p + r) / 2;
			mergeSort(a, p, q);
			mergeSort(a, q+1, r);
			merge(a, p, q, r);
		}
	}

	private static void merge(int[] a, int p, int q, int r) {
		int i = p;
		int j = q + 1;
		int t = 0;
		
		while(i <= q && j <= r) {
			if(a[i] <= a[j]) {
				temp[t] = a[i];
				i++;
			}
			else {
				temp[t] = a[j];
				j++;
			}
			t++;
		}
		
		while(i <= q) temp[t++] = a[i++];
		while(j <= r) temp[t++] = a[j++];
		
		i = p;
		t = 0;
		while(i <= r) {
			cnt++;
			if(cnt == k) {
				result = temp[t];
				break;
			}
			a[i++] = temp[t++];
		}
	}
	
}
