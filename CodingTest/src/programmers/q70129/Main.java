package programmers.q70129;

// Lv.2 이진 변환 반복하기
// https://school.programmers.co.kr/learn/courses/30/lessons/70129
public class Main {
	class Solution {
		private static int zero = 0, cnt = 0;
	    public static int[] solution(String s) {
        	calc(s);
	        return new int[]{cnt, zero};
	    }
	    private static void calc(String s) {
	    	if(s.equals("1")) return;
	    	cnt++;
	    	for(int i=0; i<s.length(); i++) if(s.charAt(i) == '0') {
	    		s = s.replaceFirst(String.valueOf(s.charAt(i)), "");
	    		zero++;
	        	i--;
	    	}
	    	calc(Long.toBinaryString(s.length()));
	    }
	}
	public static void main(String[] args) {
		String s = "1111111";
		int[] result = Solution.solution(s);
		for(int r: result) System.out.println(r);
	}
}
