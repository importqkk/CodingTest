package programmers.q12951;

// Lv.2 JadenCase 문자열 만들기
// https://school.programmers.co.kr/learn/courses/30/lessons/12951
public class Main {
	class Solution {
	    public static String solution(String s) {
	    	StringBuilder answer = new StringBuilder();
	    	String[] arr = s.split(" ");
	    	char a;
	    	for(int i=0; i<arr.length; i++) {
	    		if(arr[i].isEmpty()) {
	    			answer.append(" ");
	    			continue;
	    		}
	    		arr[i] = arr[i].toLowerCase();
	    		a = arr[i].charAt(0);
	    		if(a >= 'a' && a <= 'z') arr[i] = Character.toUpperCase(a) + arr[i].substring(1);
	    		answer.append(arr[i]);
	    		if(i < arr.length-1 || s.endsWith(" ")) answer.append(" ");
	    	}
	        return answer.toString();
	    }
	}
	public static void main(String[] args) {
		String s = "  for the what 1what  ";
		System.out.println(Solution.solution(s));
	}
}
