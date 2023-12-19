package programmers.q12940;

// Lv.1 최대공약수와 최소공배수
// https://school.programmers.co.kr/learn/courses/30/lessons/12940
public class Main2 {
	class Solution {
	    public static int[] solution(int n, int m) {
	        int[] answer = new int[2];
	        answer[0] = gcd(n, m);
	        answer[1] = n * m / answer[0];
	        return answer;
	    }
	    public static int gcd(int a, int b) {
	    	if(b == 0) return a;
	    	return gcd(b, a%b);
	    }
	}
	public static void main(String[] args) {
		int n = 5;
		int m = 2;
		int[] result = Solution.solution(n, m);
		for(int r: result) System.out.println(r);
	}
}
