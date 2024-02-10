package programmers.q87390;

// Lv.2 n^2 배열 자르기
// https://school.programmers.co.kr/learn/courses/30/lessons/87390
public class Main {
	class Solution {
	    public static int[] solution(int n, long left, long right) {
	    	int[] answer = new int[(int)(right - left + 1)];
	    	int a, b;
	    	for(int i=0; i<answer.length; i++) {
	    		a = (int) (left / n + 1);
	    		b = (int) (left % n + 1);
	    		left++;
	    		answer[i] = Math.max(a, b);
	    	}
	    	return answer;
	    }
	}
	public static void main(String[] args) {
		int n = 3;
		int left = 2;
		int right = 5;
		int[] result = Solution.solution(n, left, right);
		for(int r: result) System.out.println(r);
	}
}

// 123 223 333
// 1234 2234 3334 4444
