package programmers.q12982;
import java.util.Arrays;

// Lv.1 예산
// https://school.programmers.co.kr/learn/courses/30/lessons/12982
public class Main {
	class Solution {
	    public static int solution(int[] d, int budget) {
	        int answer = 0;
	        Arrays.sort(d);
	        for(int i=0; i<d.length; i++) {
	        	budget -= d[i];
	        	if(budget < 0) break;
	        	answer++;
	        }
	        return answer;
	    }
	}
	public static void main(String[] args) {
		int[] d = {2, 2, 3, 3};
		int budget = 10;
		System.out.println(Solution.solution(d, budget));
	}
}
