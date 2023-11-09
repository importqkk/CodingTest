package programmers.q136798;

// Lv.1 기사단원의 무기
// https://school.programmers.co.kr/learn/courses/30/lessons/136798
public class Main {
	class Solution {
	    public static int solution(int number, int limit, int power) {
	        int answer = 0, cnt;
	        for(int i=1; i<=number; i++) {
	        	cnt = 0;
	        	for(int j=1; j*j<=i; j++) {
	        		if(j*j == i) cnt++;
	        		else if(i % j == 0) cnt += 2;
	        	}
	        	if(cnt <= limit) answer += cnt;
	        	else answer += power;
	        }
	        return answer;
	    }
	}
	public static void main(String[] args) {
		int number = 10, limit = 3, power = 2;
		System.out.println(Solution.solution(number, limit, power));
	}
}
