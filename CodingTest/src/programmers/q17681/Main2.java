package programmers.q17681;

// Lv.1 비밀지도
// https://school.programmers.co.kr/learn/courses/30/lessons/17681
public class Main2 {
	class Solution {
	    public static String[] solution(int n, int[] arr1, int[] arr2) {
	        String[] answer = new String[n];
	        String tmp;
	        for(int i=0; i<n; i++) {
	        	tmp = String.format("%16s", Integer.toBinaryString(arr1[i] | arr2[i]));
	        	tmp = tmp.substring(tmp.length() - n).replaceAll("1", "#").replaceAll("0", " ");
	        	answer[i] = tmp;
	        }
	        return answer;
	    }
	}
	public static void main(String[] args) {
		int n = 6;
		int[] arr1 = {46, 33, 33 ,22, 31, 50};
		int[] arr2 = {27 ,56, 19, 14, 14, 10};
		String[] result = Solution.solution(n, arr1, arr2);
		for(String r: result) System.out.println(r);
	}
}
