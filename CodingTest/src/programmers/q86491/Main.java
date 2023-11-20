package programmers.q86491;

// Lv.1 최소직사각형
// https://school.programmers.co.kr/learn/courses/30/lessons/86491
public class Main {
	class Solution {
	    public static int solution(int[][] sizes) {
	        int min = 0, max = 0, a = 0, b = 0;
	        for(int i=0; i<sizes.length; i++) {
	        	min = Math.min(sizes[i][0], sizes[i][1]);
	        	max = Math.max(sizes[i][0], sizes[i][1]);
	        	a = Math.max(max, a);
	        	b = Math.max(min, b);
	        }
	        return a * b;
	    }
	}
	public static void main(String[] args) {
		int[][] sizes = {{14, 4}, {19, 6}, {6, 16}, {18, 7}, {7, 11}};
		System.out.println(Solution.solution(sizes));
	}
}
