package programmers.q159994;

// Lv.1 카드 뭉치
// https://school.programmers.co.kr/learn/courses/30/lessons/159994
public class Main2 {
	class Solution {
	    public static String solution(String[] cards1, String[] cards2, String[] goal) {
	        int idx1 = 0, idx2 = 0;
	        String word;
	        for(int i=0; i<goal.length; i++) {
	        	word = goal[i];
	        	if(idx1 < cards1.length && word.equals(cards1[idx1])) idx1++;
	        	else if(idx2 < cards2.length && word.equals(cards2[idx2])) idx2++;
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
