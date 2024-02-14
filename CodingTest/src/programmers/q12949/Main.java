package programmers.q12949;

// Lv.2 행렬의 곱셈
// https://school.programmers.co.kr/learn/courses/30/lessons/12949
public class Main {
	class Solution {
	    public static int[][] solution(int[][] arr1, int[][] arr2) {
	        int[][] answer = new int[arr1.length][arr2[0].length];
	        for(int i=0; i<answer.length; i++) {
	        	for(int j=0; j<answer[0].length; j++) {
	        		for(int k=0; k<arr1[0].length; k++) {
	        			answer[i][j] += arr1[i][k] * arr2[k][j];
	        		}
	        	}
	        }
	        return answer;
	    }
	}
	public static void main(String[] args) {
		int[][] arr1 = {{1,2,3,4}, {1,2,3,4}};
		int[][] arr2 = {{1,2}, {1,2}, {1,2}, {1,2}};
		int[][] result = Solution.solution(arr1, arr2);
		for(int[] re: result) for(int r: re) System.out.println(r);
	}
}
