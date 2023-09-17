package baekjoon.q1149;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	
	final static int red = 0;
	final static int green = 1;
	final static int blue = 2;
	
	private static int[][] price;
	private static int[][] minPrice;
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		price = new int[n][3];
		minPrice = new int[n][3];
		
		StringTokenizer st;
		for(int i=0; i<n; i++) {
			st = new StringTokenizer(br.readLine());
			price[i][red] = Integer.parseInt(st.nextToken());	
			price[i][green] = Integer.parseInt(st.nextToken());	
			price[i][blue] = Integer.parseInt(st.nextToken());	
		}
		br.close();
		
		minPrice[0][red] = price[0][red];
		minPrice[0][green] = price[0][green];
		minPrice[0][blue] = price[0][blue];
		
		System.out.println(Math.min(color(n-1, red), Math.min(color(n-1, green), color(n-1, blue))));
		
	}
	
	private static int color(int row, int color) {
		if(minPrice[row][color] == 0) {
			if(color == red) {
				minPrice[row][red] 
						= Math.min(color(row-1, green), color(row-1, blue)) + price[row][red];
			}
			else if(color == green) {
				minPrice[row][green] 
						= Math.min(color(row-1, red), color(row-1, blue)) + price[row][green];
			}
			if(color == blue) {
				minPrice[row][blue] 
						= Math.min(color(row-1, red), color(row-1, green)) + price[row][blue];
			}
		} 
		return minPrice[row][color];
	}
}
