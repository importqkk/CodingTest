package programmers.q12928;

// Lv.1 약수의 합
// https://school.programmers.co.kr/learn/courses/30/lessons/12928
public class Main {
	class Solution {
	    public static int solution(int n) {
	    	int answer = 0;
	        for(int i=1; i<=n/2; i++) if(n % i == 0) answer += i;
	        return answer + n;
	    }
	}
	public static void main(String[] args) {
		int n = 5;
		System.out.println(Solution.solution(n));
	}
}
