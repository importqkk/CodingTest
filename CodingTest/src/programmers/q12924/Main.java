package programmers.q12924;

// Lv.2 숫자의 표현
// https://school.programmers.co.kr/learn/courses/30/lessons/12924
public class Main {
	class Solution {
	    public static int solution(int n) {
	    	if(n < 3) return 1;
	        int answer = 1, s = 1, e = 2, sum = s+e;
	        while(e < n) {
	        	if(sum < n) {
	        		sum += ++e;
	        		continue;
	        	}
	        	if(sum == n) answer++;
	        	sum -= s++;
	        }
	        return answer;
	    }
	}
	public static void main(String[] args) {
		int n = 15;
		System.out.println(Solution.solution(n));
	}
}
