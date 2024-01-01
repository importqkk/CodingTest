package programmers.q12919;

// Lv.1 서울에서 김서방 찾기
// https://school.programmers.co.kr/learn/courses/30/lessons/12919
public class Main {
	class Solution {
	    public static String solution(String[] seoul) {
	        for(int i=0; i<seoul.length; i++) if(seoul[i].equals("Kim")) return String.format("김서방은 %d에 있다", i);
	        return "";
	    }
	}
	public static void main(String[] args) {
		String[] seoul = {"Jane", "Kim"};
		System.out.println(Solution.solution(seoul));
	}
}
