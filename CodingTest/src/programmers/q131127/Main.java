package programmers.q131127;
import java.util.HashMap;
import java.util.Map;

// Lv.2 할인 행사
// https://school.programmers.co.kr/learn/courses/30/lessons/131127
public class Main {
	class Solution {
	    public static int solution(String[] want, int[] number, String[] discount) {
	    	int answer = 0;
	    	String[] arr = new String[10];
	    	for(int i=0; i<discount.length-9; i++) {
	    		System.arraycopy(discount, i, arr, 0, 10);
	    		if(canBuyAll(want, number, arr)) answer++;
	    	}
	    	return answer;
	    }
	    private static boolean canBuyAll(String[] want, int[] number, String[] discount) {
	    	Map<String, Integer> map = new HashMap<>();
	    	for(String d: discount) map.put(d, map.getOrDefault(d, 0) + 1);
	    	for(int i=0; i<want.length; i++) if(map.getOrDefault(want[i], 0) != number[i]) return false;
	    	return true;
	    }
	}
	public static void main(String[] args) {
		String[] want = {"banana", "apple", "rice", "pork", "pot"};
		int[] number = {3, 2, 2, 2, 1};
		String[] discount = {"chicken", "apple", "apple", "banana", "rice", "apple", "pork", "banana", "pork", "rice", "pot", "banana", "apple", "banana"};
		System.out.println(Solution.solution(want, number, discount));
	}
}
