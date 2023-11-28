package programmers.q70128;

// Lv.1 내적
// https://school.programmers.co.kr/learn/courses/30/lessons/70128
public class Main {
	class Solution {
	    public static int solution(int[] a, int[] b) {
	    	int answer = 0;
	    	for(int i=0; i<a.length; i++) answer += a[i] * b[i];
	    	return answer;
	    }
	}
	public static void main(String[] args) {
		int[] a = {-1,0,1};
		int[] b = {1,0,-1};
		System.out.println(Solution.solution(a, b));
	}
}
