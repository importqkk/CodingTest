package programmers.q12953;

// Lv.2 N개의 최소공배수
// https://school.programmers.co.kr/learn/courses/30/lessons/12953
public class Main {
	class Solution {
	    public static int solution(int[] arr) {
	    	int num = arr[0];
	    	for(int i=1; i<arr.length; i++) num = lcm(num, arr[i]);
	    	return num;
	    }
	    private static int gcd(int a, int b) {
	    	int r = 0;
	    	while(b != 0) {
	    		r = a % b;
	    		a = b;
	    		b = r;
	    	}
	    	return a;
	    }
	    private static int lcm(int a, int b) {
	    	return a * b / gcd(a, b);
	    }
	}
	public static void main(String[] args) {
		int[] arr = {1, 2, 3};
		System.out.println(Solution.solution(arr));
	}
}
