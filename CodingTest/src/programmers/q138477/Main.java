package programmers.q138477;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Lv.1 명예의 전당 (1)
// https://school.programmers.co.kr/learn/courses/30/lessons/138477
public class Main {
	class Solution {
	    public static int[] solution(int k, int[] score) {
	    	List<Integer> tmp = new ArrayList<>();
	        int[] answer = new int[score.length];
	        for(int i=0; i<score.length; i++) {
	        	tmp.add(score[i]);
	        	Collections.sort(tmp, Collections.reverseOrder());
	        	if(tmp.size() < k) answer[i] = tmp.get(tmp.size()-1);
	        	else answer[i] = tmp.get(k-1);
	        }
	        return answer;
	    }
	}
	public static void main(String[] args) {
		int k = 3;
		int[] score = {10, 100, 20, 150, 1, 100, 200};
//		int k = 4;
//		int[] score = {0, 300, 40, 300, 20, 70, 150, 50, 500, 1000};
		int[] answer = Solution.solution(k, score);
		for(int a: answer) System.out.println(a);
	}
}
