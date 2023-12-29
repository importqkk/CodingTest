package programmers.q12925;

// Lv.1 문자열을 정수로 바꾸기
// https://school.programmers.co.kr/learn/courses/30/lessons/12925
public class Main {
	class Solution {
	    public static int solution(String s) {
	        return Integer.parseInt(s);
	    }
	}
	public static void main(String[] args) {
		String s = "-1234";
		System.out.println(Solution.solution(s));
	}
}
