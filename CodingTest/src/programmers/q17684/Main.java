package programmers.q17684;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

// Lv.2 [3차] 압축
// https://school.programmers.co.kr/learn/courses/30/lessons/17684
public class Main {
	class Solution {
	    public static int[] solution(String msg) {
	    	String[] alph = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
	    	HashMap<String, Integer> map = new HashMap<>();
	    	List<Integer> list = new ArrayList<>();
	    	for(int i=1; i<=alph.length; i++) map.put(alph[i-1], i);
	    	lzw(map, list, msg);
	    	int[] answer = new int[list.size()];
	    	for(int i=0; i<answer.length; i++) answer[i] = list.get(i);
	    	return answer;
	    }
	    public static void lzw(HashMap<String, Integer> map, List<Integer> list, String msg) {
	    	String str;
	    	for(int i=0; i<msg.length(); i++) {
	    		str = msg.substring(0, i+1);
	    		if(!map.containsKey(str)) {
	    			map.put(str, map.size()+1);
	    			list.add(map.get(msg.substring(0, i)));
	    			lzw(map, list, msg.substring(i));
	    			break;
	    		} else if(i+1 == msg.length()) list.add(map.get(msg.substring(0, i+1)));
	    	}
	    }
	}
	public static void main(String[] args) {
		String msg = "ABABABABABABABAB";
		int[] arr = Solution.solution(msg);
		for(int a: arr) System.out.println(a);
	}
}
