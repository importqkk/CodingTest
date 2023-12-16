package programmers.q12947;

// Lv.1 하샤드 수
// https://school.programmers.co.kr/learn/courses/30/lessons/12947
public class Main {
	class Solution {
	    public static boolean solution(int x) {
	    	String str = String.valueOf(x); int sum=0;
	    	for(int i=0; i<str.length(); i++) sum += str.charAt(i) - '0';
	        if(x % sum == 0) return true;
	        else return false;
	    }
	}
	public static void main(String[] args) {
		int x = 13;
		System.out.println(Solution.solution(x));
	}
}
