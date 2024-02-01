package programmers.q138476;
import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

// Lv.2 귤 고르기
// https://school.programmers.co.kr/learn/courses/30/lessons/138476
public class Main {
	class Solution {
	    public static int solution(int k, int[] tangerine) {
	    	int answer = 0, cnt = 0, before = tangerine[0];
	    	PriorityQueue<Integer> q = new PriorityQueue<>(Collections.reverseOrder());
	    	Arrays.sort(tangerine);
	    	for(int t: tangerine) {
	    		if(before == t) cnt++;
	    		else {
	    			q.add(cnt);
	    			before = t;
	    			cnt = 1;
	    		}
	    	}
	    	q.add(cnt);
	    	while(k > 0) {
	    		k -= q.poll();
	    		answer++;
	    	}
	    	return answer;
	    }
	}
	public static void main(String[] args) {
		int k = 6;
		int[] tangerine = {1, 3, 2, 5, 4, 5, 2, 3};
		System.out.println(Solution.solution(k, tangerine));
	}
}
