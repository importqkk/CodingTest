package programmers.q12917;

// Lv.1 문자열 내림차순으로 배치하기
// https://school.programmers.co.kr/learn/courses/30/lessons/12917
public class Main {
	class Solution {
	    public static String solution(String s) {
	        char[] arr = s.toCharArray();
	        char c;
	        for(int i=0; i<s.length()-1; i++) for(int j=0; j<s.length()-1; j++) if(arr[j] < arr[j+1]) {
	        	c = arr[j];
	        	arr[j] = arr[j+1];
	        	arr[j+1] = c;
	        }
	        return String.valueOf(arr);
	    }
	}
	public static void main(String[] args) {
		String s = "Zbcdefg";
		System.out.println(Solution.solution(s));
	}
}
