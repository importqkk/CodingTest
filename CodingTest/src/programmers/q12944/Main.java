package programmers.q12944;

// Lv.1 평균 구하기
// https://school.programmers.co.kr/learn/courses/30/lessons/12944
public class Main {
	class Solution {
	    public static double solution(int[] arr) {
	        double sum = 0;
	        for(int i=0; i<arr.length; i++) sum += arr[i];
	        return sum / arr.length;
	    }
	}
	public static void main(String[] args) {
		int[] arr = {5, 5};
		System.out.println(Solution.solution(arr));
	}
}
