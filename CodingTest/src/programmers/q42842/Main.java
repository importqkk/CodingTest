package programmers.q42842;

// Lv.2 카펫
// https://school.programmers.co.kr/learn/courses/30/lessons/42842
public class Main {
	class Solution {
	    public static int[] solution(int brown, int yellow) {
	        int x = 0, y = 1;
	        while(true) {
	        	x = (brown / 2)  - y + 2;
	        	if(y * x - brown == yellow) break;
	        	y++;
	        }
	        return new int[] {x, y};
	    }
	}
	public static void main(String[] args) {
		int brown = 24, yellow = 24;
		int[] result = Solution.solution(brown, yellow);
		for(int r: result) System.out.println(r);
	}
}
