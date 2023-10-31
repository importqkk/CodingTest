package programmers.q161989;

// Lv1. 덧칠하기
// https://school.programmers.co.kr/learn/courses/30/lessons/161989
public class Main {
	class Solution {
	    public static int solution(int n, int m, int[] section) {
	    	int cnt = 1, paint = section[0];
    		for(int i=1; i<section.length; i++) if(paint + m - 1 < section[i]) {
    			cnt++;
    			paint = section[i];
    		}
	        return cnt;
	    }
	}
	public static void main(String[] args) {
		int n = 8, m = 4;
		int[] section = {2, 3, 6};
		System.out.println(Solution.solution(n, m, section));
	}
}
