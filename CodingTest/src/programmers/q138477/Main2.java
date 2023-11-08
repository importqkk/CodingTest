package programmers.q138477;
import java.util.PriorityQueue;

// Lv.1 명예의 전당 (1)
// https://school.programmers.co.kr/learn/courses/30/lessons/138477
public class Main2 {
	class Solution {
	    public static int[] solution(int k, int[] score) {
	        int[] answer = new int[score.length];
	        PriorityQueue<Integer> q = new PriorityQueue<>();
	        for(int i=0; i<score.length; i++) {
	        	q.add(score[i]);
	        	if(q.size() > k) q.poll();
	        	answer[i] = q.peek();
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
