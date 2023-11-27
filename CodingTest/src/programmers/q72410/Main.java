package programmers.q72410;

// Lv.1 신규 아이디 추천
// https://school.programmers.co.kr/learn/courses/30/lessons/72410
public class Main {
	class Solution {
	    public static String solution(String new_id) {
	    	String newId = new_id.toLowerCase();
	    	newId = newId.replaceAll("[^a-z0-9-_.]", "").replaceAll("[.]{2,}", ".").replaceAll("^[.]|[.]$", "");
	    	if(newId.length() >= 16) {
	    		newId = newId.substring(0, 15);
	    		newId = newId.replaceAll("[.]$", "");
	    	}
	    	if(newId.isEmpty()) newId = "a";
	    	if(newId.length() <= 2) {
	    		StringBuilder sb = new StringBuilder();
	    		sb.append(newId);
	    		while(sb.length() < 3) sb.append(newId.charAt(newId.length()-1));
	    		newId = sb.toString();
	    	}
	    	return newId;
	    }
	}
	public static void main(String[] args) {
		String newId = "z-+.^.";
		System.out.println(Solution.solution(newId));
	}
}
