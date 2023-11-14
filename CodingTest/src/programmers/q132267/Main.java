package programmers.q132267;

// Lv.1 콜라 문제
// https://school.programmers.co.kr/learn/courses/30/lessons/132267
public class Main {
	class Solution {
	    public static int solution(int a, int b, int n) {
	    	int answer = 0, tmp;
	        while(n >= a) {
	        	tmp = n % a;
	        	n = (n/a) * b;
	        	answer += n;
	        	n += tmp;
	        }
	        return answer;
	    }
	}
	public static void main(String[] args) {
		int a = 2, b = 1, n = 20;
		System.out.println(Solution.solution(a, b, n));
	}
}
