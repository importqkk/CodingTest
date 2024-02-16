package programmers.q42578;
import java.util.HashMap;
import java.util.Map;

// Lv.2 의상
// https://school.programmers.co.kr/learn/courses/30/lessons/42578
public class Main {
	class Solution {
	    public static int solution(String[][] clothes) {
	        int answer = 1, len = 0;
	        Map<String, Integer> map = new HashMap<>();
	        String[] key = new String[clothes.length];
	        for(int i=0; i<clothes.length; i++) {
	        	len = clothes[i].length-1;
	        	map.put(clothes[i][len], map.getOrDefault(clothes[i][len], 0) + 1);
	        	key[i] = clothes[i][len];
	        }
	        for(int c: map.values()) answer *= c + 1;
	        return answer - 1;
	    }
	}
	public static void main(String[] args) {
		String[][] clothes = {{"yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"}, {"green_turban", "headgear"}};
		System.out.println(Solution.solution(clothes));
	}
}
