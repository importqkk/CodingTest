package programmers.q42586;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

// Lv.2 기능개발
// https://school.programmers.co.kr/learn/courses/30/lessons/42586
public class Main {
	class Solution {
	    public static List<Integer> solution(int[] progresses, int[] speeds) {
	    	List<Integer> answer = new ArrayList<>();
	        int day, num, poll;
	        Queue<Integer> q = new LinkedList<Integer>();
	        for(int i=0; i<progresses.length; i++) {
	        	num = (100 - progresses[i]) % speeds[i];
	        	day = (100 - progresses[i]) / speeds[i];
	        	q.add(num == 0 ? day : day+1);
	        }
	        while(!q.isEmpty()) {
	        	num = 1;
	        	poll = q.poll();
	        	while(!q.isEmpty()) {
		        	if(q.peek() <= poll) {
		        		q.poll();
		        		num++;
		        	} else break;
	        	}
	        	answer.add(num);
	        }
	        return answer;
	    }
	}
	public static void main(String[] args) {
		int[] progresses = {90, 90};
		int[] speeds = {10, 9};
		System.out.println(Solution.solution(progresses, speeds));
	}
}
