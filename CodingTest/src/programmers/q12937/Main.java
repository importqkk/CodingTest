package programmers.q12937;

// Lv.1 짝수와 홀수
// https://school.programmers.co.kr/learn/courses/30/lessons/12937
public class Main {
	class Solution {
	    public static String solution(int num) {
	        if(num % 2 == 0) return "Even";
	        else return "Odd";
	    }
	}
	public static void main(String[] args) {
		int num = 0;
		System.out.println(Solution.solution(num));
	}
}
