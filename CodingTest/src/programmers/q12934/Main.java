package programmers.q12934;

// Lv.1 정수 제곱근 판별
// https://school.programmers.co.kr/learn/courses/30/lessons/12934
public class Main {
	class Solution {
	    public static long solution(long n) {
	        return (Math.sqrt(n) % 1 == 0) ? (long) Math.pow(Math.sqrt(n)+1, 2) : -1;
	    }
	}
	public static void main(String[] args) {
		long n = 3;
		System.out.println(Solution.solution(n));
	}
}
