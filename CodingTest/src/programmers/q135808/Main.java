package programmers.q135808;
import java.util.Arrays;
import java.util.Collections;

//Lv.1 과일 장수
//https://school.programmers.co.kr/learn/courses/30/lessons/135808
public class Main {
	class Solution {
	    public static int solution(int k, int m, int[] score) {
	        int answer = 0, idx = -1;
	        Integer[] arr = Arrays.stream(score).boxed().toArray(Integer[]::new);
	        Arrays.sort(arr, Collections.reverseOrder());
	        if(arr.length < m) return 0;
	        while(arr.length-idx > m) {
	        	idx += m;
	        	answer += arr[idx] * m;
	        }
	        return answer;
	    }
	}
	public static void main(String[] args) {
//		int k = 3;
//		int m = 4;
//		int[] score = {1, 2, 3, 1, 2, 3, 1};
//		int k = 4;
//		int m = 3;
//		int[] score = {4, 1, 2, 2, 4, 4, 4, 4, 1, 2, 4, 2};
		int k = 2;
		int m = 3;
		int[] score = {1, 2};
		System.out.println(Solution.solution(k, m, score));
	}
}
