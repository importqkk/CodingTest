package programmers.q42587;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

// Lv.2 프로세스
// https://school.programmers.co.kr/learn/courses/30/lessons/42587
public class Main {
	class Solution {
	    public static int solution(int[] priorities, int location) {
	        int answer = 1, poll, val;
	        Queue<Integer> q = new PriorityQueue<>(Comparator.reverseOrder());
	        Queue<Integer> oq = new LinkedList<>();
	        for(int i=0; i<priorities.length; i++) {
	        	q.add(priorities[i]);
	        	oq.add(i);
	        }
	        while(!oq.isEmpty()) {
	        	poll = oq.poll();
	        	val = priorities[poll];
	        	if(val < q.peek()) oq.add(poll);
	        	else if(val == q.peek()) {
	        		if(poll == location) return answer;
        			q.remove();
        			answer++;
	        	}
	        }
	        return answer;
	    }
	}
	public static void main(String[] args) {
		int[] priorities = {1, 1, 9, 1, 1, 1};
		int location = 0;
		System.out.println(Solution.solution(priorities, location));
	}
}
