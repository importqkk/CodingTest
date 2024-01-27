package programmers.q12980;

// Lv.2 점프와 순간 이동 
// https://school.programmers.co.kr/learn/courses/30/lessons/12980
// https://school.programmers.co.kr/questions/37957
public class Main {
	public class Solution {
	    public static int solution(int n) {
	    	int ans = 0;
	    	String bin = Integer.toBinaryString(n);
	    	for(int i=0; i<bin.length(); i++) if(bin.charAt(i) == '1') ans++;
	    	return ans;
	    }
	}
	public static void main(String[] args) {
		int n = 5000;
		System.out.println(Solution.solution(n));
	}
}
