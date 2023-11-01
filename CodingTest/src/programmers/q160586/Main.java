package programmers.q160586;

import java.util.HashMap;

// Lv.1 대충 만든 자판
// https://school.programmers.co.kr/learn/courses/30/lessons/160586
public class Main {
	class Solution {
	    public static int[] solution(String[] keymap, String[] targets) {
	    	HashMap<Character, Integer> map = new HashMap<>();
	    	String key, str;
	    	char c, s;
	    	int sum = 0;
	    	int[] answer = new int[targets.length];
	    	for(int i=0; i<keymap.length; i++) {
	    		key = keymap[i];
	    		for(int j=0; j<key.length(); j++) {
	    			c = key.charAt(j);
	    			if(map.containsKey(c) && map.get(c) < j+1) continue;
	    			else map.put(c, j + 1);
	    		}
	    	}
	    	for(int i=0; i<targets.length; i++) {
	    		str = targets[i];
	    		sum = 0;
	    		for(int j=0; j<str.length(); j++) {
	    			s = str.charAt(j);
	    			if(!map.containsKey(s)) {
	    				sum = -1;
	    				break;
	    			} else sum += map.get(s);
	    		}
	    		answer[i] = sum;
	    	}
	        
	        return answer;
	    }
	}
	public static void main(String[] args) {
		String[] keymap = {"AGZ", "BSSS"};
		String[] targets = {"ASA","BGZ"};
		int[] answer = Solution.solution(keymap, targets);
		for(int a: answer) System.out.println(a);
	}
}
