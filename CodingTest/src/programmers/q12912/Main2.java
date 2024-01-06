package programmers.q12912;

// Lv.1 두 정수 사이의 합
// https://school.programmers.co.kr/learn/courses/30/lessons/12912
public class Main2 {
	class Solution {
	    public static long solution(int a, int b) {
	    	long max = Math.max(a, b), min = Math.min(a, b);
	    	return (max - min + 1) * (min + max) / 2;
	    }
	}
	public static void main(String[] args) {
		int a = 5, b = 3;
		System.out.println(Solution.solution(a, b));
	}
}
