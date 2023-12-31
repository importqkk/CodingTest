package programmers.q12921;

// Lv.1 소수 찾기
// https://school.programmers.co.kr/learn/courses/30/lessons/12921
public class Main {
	class Solution {
	    public static int solution(int n) {
	        int answer = 0;
	        boolean isPrime;
	        for(int i=2; i<=n; i++) {
	        	isPrime = true;
	        	for(int j=2; j*j<=i; j++) if(i % j == 0) {
	        		isPrime = false;
	        		break;
	        	}
	        	if(isPrime) answer++;
	        }
	        return answer;
	    }
	}
	public static void main(String[] args) {
		int n = 5;
		System.out.println(Solution.solution(n));
	}
}
