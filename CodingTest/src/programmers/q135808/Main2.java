package programmers.q135808;
import java.util.Arrays;

// Lv.1 과일 장수
// https://school.programmers.co.kr/learn/courses/30/lessons/135808
public class Main2 {
	class Solution {
	    public static int solution(int k, int m, int[] score) {
	        int answer = 0, idx = score.length;
	        Arrays.sort(score);
	        if(score.length < m) return 0;
	        for(int i=score.length-m; i>=0; i--) {
	        	idx -= m;
	        	if(idx < 0) break;
	        	answer += score[idx] * m;
	        }
	        return answer;
	    }
	}
	public static void main(String[] args) {
		int k = 3;
		int m = 4;
		int[] score = {1, 2, 3, 1, 2, 3, 1};
		System.out.println(Solution.solution(k, m, score));
	}
}
