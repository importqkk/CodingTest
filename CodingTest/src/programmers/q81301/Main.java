package programmers.q81301;

// Lv.1 숫자 문자열과 영단어
// https://school.programmers.co.kr/learn/courses/30/lessons/81301
public class Main {
	class Solution {
	    public static int solution(String s) {
	        String arr[] = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
	        for(int i=0; i<arr.length; i++) s = s.replace(arr[i], Integer.toString(i));
	        return Integer.parseInt(s);
	    }
	}
	public static void main(String[] args) {
		String s = "23four5six7";
		System.out.println(Solution.solution(s));
	}
}
