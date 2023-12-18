package programmers.q12943;

// Lv.1 콜라츠 추측
// https://school.programmers.co.kr/learn/courses/30/lessons/12943
public class Main {
	class Solution {
	    public static int solution(long num) {
	    	int answer = 0;
	        while(num != 1) {
	        	if(answer >= 500) return -1;
	        	answer++;
	        	if(num % 2 == 0) num /= 2;
	        	else num = num * 3 + 1;
	        }
	        return answer;
	    }
	}
	public static void main(String[] args) {
		int num = 626331;
		System.out.println(Solution.solution(num));
	}
}
