package programmers.q17682;

// Lv.1 다트 게임
// https://school.programmers.co.kr/learn/courses/30/lessons/17682
public class Main {
	class Solution {
	    public static int solution(String dartResult) {
	    	int answer = 0, n=0, idx=0;
	    	int[] arr = new int[3];
	    	String num = "";
	    	char c;
	    	for(int i=0; i<dartResult.length(); i++) {
	    		c = dartResult.charAt(i);
	    		if(c >= '0' && c <= '9') num += String.valueOf(c);
	    		else if(c == 'S' || c == 'D' || c == 'T') {
	    			n = Integer.parseInt(num);
	    			if(c == 'S') arr[idx] = n;
	    			else if(c == 'D') arr[idx] = (int)Math.pow(n, 2);
	    			else arr[idx] = (int)Math.pow(n, 3);
	    			idx++; num = "";
	    		} else {
	    			if(c == '*') {
	    				arr[idx-1] *= 2;
	    				if(idx - 2 >= 0) arr[idx-2] *= 2;
	    			} else arr[idx-1] *= -1;
	    		}
	    	}
	    	answer = arr[0] + arr[1] + arr[2];
	    	return answer;
	    }
	}
	public static void main(String[] args) {
		String dartResult = "1D#2S*3S";
		System.out.println(Solution.solution(dartResult));
	}
}
