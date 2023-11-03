package programmers.q155652;

public class Main {
	class Solution {
	    public static String solution(String s, String skip, int index) {
	    	String answer = "";
	    	char c;
	    	for(int i=0; i<s.length(); i++) {
	    		c = s.charAt(i);
	    		for(int j=0; j<index; j++) {
	    			c++;
	    			if(c > 'z') c -= 26;
	    			if(skip.contains(String.valueOf(c))) j--;
	    		}
	    		answer += c;
	    	}
	    	return answer;
	    }
	}
	public static void main(String[] args) {
		String s = "aukks";
		String skip = "wbqd";
		int index = 5;
		System.out.println(Solution.solution(s, skip, index));
	}
}
