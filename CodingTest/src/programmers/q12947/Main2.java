package programmers.q12947;

// Lv.1 하샤드 수
// https://school.programmers.co.kr/learn/courses/30/lessons/12947
public class Main2 {
	class Solution {
	    public static boolean solution(int x) {
	    	int sum = String.valueOf(x).chars().map(c -> c - '0').sum();
	    	return x % sum == 0;
	    }
	}
	public static void main(String[] args) {
		int x = 13;
		System.out.println(Solution.solution(x));
	}
}
