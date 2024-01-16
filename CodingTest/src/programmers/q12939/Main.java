package programmers.q12939;

// Lv.2 최댓값과 최솟값
// https://school.programmers.co.kr/learn/courses/30/lessons/12939
public class Main {
	class Solution {
	    public static String solution(String s) {
	        StringBuilder answer = new StringBuilder();
	        String[] arr = s.split(" ");
	        int a = 0, min, max;
	        min = max = Integer.parseInt(arr[0]);
	        for(int i=1; i<arr.length; i++) {
	        	a = Integer.parseInt(arr[i]);
	        	min = min > a ? a : min;
	        	max = max < a ? a : max;
	        }
	        return answer.append(min).append(" ").append(max).toString();
	    }
	}
	public static void main(String[] args) {
		String s = "-1 -1";
		System.out.println(Solution.solution(s));
	}
}
