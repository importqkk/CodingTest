package programmers.q42747;
import java.util.Arrays;

// Lv.2 H-Index
// https://school.programmers.co.kr/learn/courses/30/lessons/42747
public class Main {
	class Solution {
	    public static int solution(int[] citations) {
	        int n = citations.length, h = 0, answer = 0;
	        Arrays.sort(citations);
	        for(int i=0; i<n; i++) {
	        	h = Math.min(citations[i], n-i);
	        	answer = Math.max(answer, h);
	        }
	        return answer;
	    }
	}
	public static void main(String[] args) {
		int[] citations = {1, 2, 6, 7, 9};
		System.out.println(Solution.solution(citations));
	}
}
