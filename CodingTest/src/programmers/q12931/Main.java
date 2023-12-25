package programmers.q12931;

// Lv.1 자릿수 더하기
// https://school.programmers.co.kr/learn/courses/30/lessons/12931
public class Main {
	public class Solution {
	    public static int solution(int n) {
	        String str = String.valueOf(n);
	        int answer = 0;
	        for(int i=0; i<str.length(); i++) answer += str.charAt(i) - '0';
	        return answer;
	    }
	}
	public static void main(String[] args) {
		int n = 987;
		System.out.println(Solution.solution(n));
	}
}
