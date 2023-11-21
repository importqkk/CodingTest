package programmers.q86051;

// Lv.1 없는 숫자 더하기
// https://school.programmers.co.kr/learn/courses/30/lessons/86051
public class Main {
	class Solution {
	    public static int solution(int[] numbers) {
	        int answer = 45;
	        for(int n: numbers) answer -= n;
	        return answer;
	    }
	}
	public static void main(String[] args) {
		int[] numbers = {1,2,3,4,6,7,8,0};
		System.out.println(Solution.solution(numbers));
	}
}
