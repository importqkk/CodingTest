package programmers.q87389;

public class Main {
	class Solution {
	    public static int solution(int n) {
	    	for(int i=2; i<n; i++) if(n % i == 1) return i;
	    	return 0;
	    }
	}
	public static void main(String[] args) {
		int n = 10;
		System.out.println(Solution.solution(n));
	}
}
