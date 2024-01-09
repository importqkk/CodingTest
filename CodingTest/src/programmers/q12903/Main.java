package programmers.q12903;

// Lv.1 가운데 글자 가져오기
// https://school.programmers.co.kr/learn/courses/30/lessons/12903
public class Main {
	class Solution {
	    public static String solution(String s) {
	    	return s.substring((s.length()-1)/2, s.length()/2 + 1);
	    }
	}
	public static void main(String[] args) {
		String s = "abcde";
		System.out.println(Solution.solution(s));
	}
}
