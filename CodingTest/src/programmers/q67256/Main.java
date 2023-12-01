package programmers.q67256;

// Lv.1 키패드 누르기
// https://school.programmers.co.kr/learn/courses/30/lessons/67256
public class Main {
	class Solution {
		public static StringBuilder sb = new StringBuilder();
		public static int left = 10, right = 12;
	    public static String solution(int[] numbers, String hand) {
	    	int n, leftDist, rightDist;
	    	for(int i=0; i<numbers.length; i++) {
	    		n = numbers[i];
	    		switch(n) {
					case 1: case 4: case 7: useLeft(n); break;
					case 3: case 6: case 9: useRight(n); break;
					default: {
						if(n == 0) n = 11;
		    			leftDist = (Math.abs(n-left)/3) + (Math.abs(n-left)%3);
		    			rightDist = (Math.abs(n-right)/3) + (Math.abs(n-right)%3);
		    			if(leftDist == rightDist) {
		    				if(hand.equals("left")) useLeft(n);
		    				else useRight(n);
		    			}
		    			else if(leftDist > rightDist) useRight(n);
		    			else useLeft(n);
		    			break;
					}
				}
	    	}
	        return sb.toString();
	    }
	    public static void useLeft(int n) {
	    	left = n;
	    	sb.append("L");
	    }
	    public static void useRight(int n) {
	    	right = n;
	    	sb.append("R");
	    }
	}
	public static void main(String[] args) {
		int[] numbers = {1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5};
		String hand = "right";
		System.out.println(Solution.solution(numbers, hand));
	}
}
