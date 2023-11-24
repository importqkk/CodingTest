package programmers.q77884;

// Lv.1 약수의 개수와 덧셈
// https://school.programmers.co.kr/learn/courses/30/lessons/77884
public class Main {
	class Solution {
	    public static int solution(int left, int right) {
	        int answer = 0, cnt;
	        for(int i=left; i<=right; i++) {
	        	cnt = 0;
	        	for(int j=1; j<=i; j++) if(i % j == 0) cnt++;
	        	if(cnt % 2 == 0) answer += i;
	        	else answer -= i;
	        }
	        return answer;
	    }
	}
	public static void main(String[] args) {
		int left = 1;
		int right = 2;
		System.out.println(Solution.solution(left, right));
	}
}
