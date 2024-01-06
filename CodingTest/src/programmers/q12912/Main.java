package programmers.q12912;

// Lv.1 두 정수 사이의 합
// https://school.programmers.co.kr/learn/courses/30/lessons/12912
public class Main {
	class Solution {
	    public static long solution(int a, int b) {
	    	long answer = 0;
	    	for(int i=Math.min(a, b); i<=Math.max(a, b); i++) answer += i;
	    	return answer;
	    }
	}
	public static void main(String[] args) {
		int a = 3, b = 3;
		System.out.println(Solution.solution(a, b));
	}
}
