package programmers.q42576;
import java.util.HashMap;

//Lv.1 완주하지 못한 선수
//https://school.programmers.co.kr/learn/courses/30/lessons/42576
public class Main4 {
	class Solution {
	    public static String solution(String[] participant, String[] completion) {
	    	HashMap<String, Integer> map = new HashMap<>();
	    	for(String p: participant) map.put(p, map.getOrDefault(p, 0) + 1);
	    	for(String c: completion) map.put(c, map.get(c)-1);
	    	for(String k: map.keySet()) if(map.get(k) != 0) return k;
	    	return "";
	    }
	}
	public static void main(String[] args) {
		String[] participant = {"mislav", "stanko", "mislav", "ana"};
		String[] completion = {"stanko", "ana", "mislav"};
		System.out.println(Solution.solution(participant, completion));
	}
}
