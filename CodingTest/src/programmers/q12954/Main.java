package programmers.q12954;

// x만큼 간격이 있는 n개의 숫자
// https://school.programmers.co.kr/learn/courses/30/lessons/12954
public class Main {
	class Solution {
	    public static long[] solution(int x, int n) {
	        long[] answer = new long[n];
	        answer[0] = x;
	        for(int i=1; i<n; i++) answer[i] = answer[i-1] + x;
	        return answer;
	    }
	}
	public static void main(String[] args) {
		int x = -4;
		int n = 2;
		long[] answer = Solution.solution(x, n);
		for(long a: answer) System.out.println(a);
	}
}
