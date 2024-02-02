package programmers.q131701;
import java.util.HashSet;
import java.util.Set;

// Lv.2 연속 부분 수열 합의 개수
// https://school.programmers.co.kr/learn/courses/30/lessons/131701
public class Main {
	class Solution {
	    public static int solution(int[] elements) {
	        int sum, len = elements.length;
	        Set<Integer> answer = new HashSet<>();
	        for(int i=1; i<=len; i++) for(int j=0; j<len; j++) {
        		sum = 0;
        		for(int k=i; k<j+i; k++) sum += elements[k % len];
        		answer.add(sum);
	        }
	        return answer.size();
	    }
	}
	public static void main(String[] args) {
		int[] element = {7, 9, 1, 1, 4};
		System.out.println(Solution.solution(element));
	}
}
