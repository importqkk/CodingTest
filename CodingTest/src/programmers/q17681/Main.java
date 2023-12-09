package programmers.q17681;

// Lv.1 비밀지도
// https://school.programmers.co.kr/learn/courses/30/lessons/17681
public class Main {
	class Solution {
	    public static String[] solution(int n, int[] arr1, int[] arr2) {
	        String[] answer = new String[n];
	        StringBuilder sb;
	        int[] dup;
	        String tmp1 = "", tmp2 = "";
	        for(int i=0; i<n; i++) {
	        	tmp1 = Integer.toBinaryString(arr1[i]);
	        	tmp2 = Integer.toBinaryString(arr2[i]);
	        	if(tmp1.length() != n) tmp1 = String.format("%"+n+"s", tmp1).replace(" ", "0");
	        	if(tmp2.length() != n) tmp2 = String.format("%"+n+"s", tmp2).replace(" ", "0");
	        	sb = new StringBuilder();
	        	dup = new int[n];
	        	for(int j=0; j<n; j++) {
	        		if(tmp1.charAt(j) == '1') dup[j] = 1;
	        		if(tmp2.charAt(j) == '1' && dup[j] == 0) dup[j] = 1;
	        		if(dup[j] == 1) sb.append("#");
	        		else sb.append(" ");
	        	}
	        	answer[i] = sb.toString();
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
