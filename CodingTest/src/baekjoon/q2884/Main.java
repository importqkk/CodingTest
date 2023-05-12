package baekjoon.q2884;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int m = sc.nextInt();
		sc.close();
		
		if(h == 0 && m < 45) {
			h += 24;
		}
		
		int hToM = h * 60;
		int totalMin = hToM + m;
		
		int targetTime = totalMin - 45;

		int targetH = targetTime / 60;
		int targetM = targetTime % 60;
		
		System.out.println(targetH + " " + targetM);
		
	}
}
