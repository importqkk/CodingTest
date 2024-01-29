package programmers.q12985;

// Lv.2 예상 대진표
// https://school.programmers.co.kr/learn/courses/30/lessons/12985
public class Main {
	class Solution {
	    public static int solution(int n, int a, int b) {
	        int answer = 0;
	        while(a != b) {
	        	a = (a + 1) / 2;
	        	b = (b + 1) / 2;
	        	answer++;
	        }
	        return answer;
	    }
	}
	public static void main(String[] args) {
		int n = 8, a = 4, b = 7;
		System.out.println(Solution.solution(n, a, b));
	}
}

// 1-2 / 3-a / 5-6 / b-8
// 1-a / 3-b
// a-b