package programmers.q76501;

// Lv.1 음양 더하기
// https://school.programmers.co.kr/learn/courses/30/lessons/76501
public class Main {
	class Solution {
	    public static int solution(int[] absolutes, boolean[] signs) {
	        int answer = 0;
	        for(int i=0; i<absolutes.length; i++) {
	        	if(signs[i]) answer += absolutes[i];
	        	else answer -= absolutes[i];
	        }
	        return answer;
	    }
	}
	public static void main(String[] args) {
		int[] absolutes = {1,2,3};
		boolean[] signs = {false,false,true};
		System.out.println(Solution.solution(absolutes, signs));
	}
}
