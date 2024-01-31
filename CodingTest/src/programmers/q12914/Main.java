package programmers.q12914;

// Lv.2 멀리 뛰기
// https://school.programmers.co.kr/learn/courses/30/lessons/12914
public class Main {
	class Solution {
	    public static long solution(int n) {
	        int div = 1234567;
	        long[] arr = new long[n + 1];
	        if(n == 1) return 1;
	        if(n == 2) return 2;
	        arr[0] = 0;
	        arr[1] = 1;
	        arr[2] = 2;
	        for(int i=3; i<=n; i++) arr[i] = (arr[i-1] + arr[i-2]) % div;
	        return arr[n];
	    }
	}
	public static void main(String[] args) {
		int n = 4;
		System.out.println(Solution.solution(n));
	}
}
