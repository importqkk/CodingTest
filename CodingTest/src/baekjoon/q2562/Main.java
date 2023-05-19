package baekjoon.q2562;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[9];
		int max = 0;
		int index = 1;
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
			if(arr[i] > max) max = arr[i];
		}
		for(int i=0; i<arr.length; i++) {
			if(arr[i] != max) index++;
			else break;
		}
		sc.close();
		
		System.out.println(max);
		System.out.println(index);
		
	}
}
