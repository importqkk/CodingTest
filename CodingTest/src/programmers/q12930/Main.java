package programmers.q12930;

// Lv.1 이상한 문자 만들기
// https://school.programmers.co.kr/learn/courses/30/lessons/12930
public class Main {
	class Solution {
	    public static String solution(String s) {
	        StringBuilder answer = new StringBuilder();
	        int idx = 0;
	        String str = "";
	        s = s.toLowerCase();
	        for(int i=0; i<s.length(); i++) {
	        	str = s.substring(i, i+1);
	        	if(str.equals(" ")) {
	        		answer.append(str);
	        		idx = 0;
	        		continue;
	        	}
	        	if(idx==0 || idx%2==0) answer.append(str.toUpperCase());
	        	else answer.append(str);
	        	idx++;
	        }
	        return answer.toString();
	    }
	}
	public static void main(String[] args) {
		String s = "try hello world";
		System.out.println(Solution.solution(s));
	}
}
