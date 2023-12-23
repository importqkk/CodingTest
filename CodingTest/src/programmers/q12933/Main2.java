package programmers.q12933;
import java.util.Arrays;

// 정수 내림차순으로 배치하기
// https://school.programmers.co.kr/learn/courses/30/lessons/12933
public class Main2 {
	class Solution {
	    public static long solution(long n) {
	    	String[] arr = String.valueOf(n).split("");
	    	Arrays.sort(arr);
	    	StringBuilder answer = new StringBuilder();
	    	for(String a: arr) answer.append(a);
	    	return Long.parseLong(answer.reverse().toString());
	    }
	}
	public static void main(String[] args) {
		long n = 118372;
		System.out.println(Solution.solution(n));
	}
}
