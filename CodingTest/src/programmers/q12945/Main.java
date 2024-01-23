package programmers.q12945;

// Lv.2 피보나치 수
// https://school.programmers.co.kr/learn/courses/30/lessons/12945
public class Main {
	class Solution {
	    public static int solution(int n) {
	        int div = 1234567;
	        int[] fibs = new int[n+1];
	        fibs[0] = 0; fibs[1] = fibs[2] = 1;
	        for(int i=3; i<fibs.length; i++) fibs[i] = (fibs[i-2] + fibs[i-1]) % div;
	        return fibs[n];
	    }
	}
	public static void main(String[] args) {
		int n = 3;
		System.out.println(Solution.solution(n));
	}
}
