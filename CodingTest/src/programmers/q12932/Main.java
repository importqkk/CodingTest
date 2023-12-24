package programmers.q12932;

// 자연수 뒤집어 배열로 만들기
// https://school.programmers.co.kr/learn/courses/30/lessons/12932
public class Main {
	class Solution {
	    public static int[] solution(long n) {
	    	String str = String.valueOf(n);
	        int[] arr = new int[str.length()];
	        int idx = 0;
	        for(int i=str.length()-1; i>=0; i--) {
	        	arr[idx] = str.charAt(i) - '0';
	        	idx++;
	        }
	        return arr;
	    }
	}
	public static void main(String[] args) {
		long n = 12345;
		int[] result = Solution.solution(n);
		for(int r: result) System.out.println(r);
	}
}
