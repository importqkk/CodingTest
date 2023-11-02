package programmers.q159994;
import java.util.LinkedList;
import java.util.Queue;

// Lv.1 카드 뭉치
// https://school.programmers.co.kr/learn/courses/30/lessons/159994
public class Main {
	class Solution {
	    public static String solution(String[] cards1, String[] cards2, String[] goal) {
	        Queue<String> queue1 = new LinkedList<>();
	        Queue<String> queue2 = new LinkedList<>();
	        for(int i=0; i<cards1.length; i++) queue1.add(cards1[i]);
	        for(int i=0; i<cards2.length; i++) queue2.add(cards2[i]);
	        for(int i=0; i<goal.length; i++) {
	        	if(goal[i].equals(queue1.peek())) queue1.poll();
	        	else if(goal[i].equals(queue2.peek())) queue2.poll();
	        	else return "No";
	        }
	        return "Yes";
	    }
	}
	public static void main(String[] args) {
		String[] cards1 = {"i", "drink", "water"};
		String[] cards2 = {"want", "to"};
		String[] goal = {"i", "want", "to", "drink", "water"};
//		String[] cards1 = {"i", "water", "drink"};
//		String[] cards2 = {"want", "to"};
//		String[] goal = {"i", "want", "to", "drink", "water"};
		System.out.println(Solution.solution(cards1, cards2, goal));
	}
}
