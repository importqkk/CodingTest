package programmers.q43165;

// Lv.2 타겟 넘버
// https://school.programmers.co.kr/learn/courses/30/lessons/43165
public class Main {
	class Solution {
		static int answer = 0;
	    public static int solution(int[] numbers, int target) {
	        dfs(numbers, 0, target, 0);
	        return answer;
	    }
	    public static void dfs(int[] numbers, int depth, int target, int sum) {
	        if(depth == numbers.length) {
	        	if(target == sum) answer++;
	        } else {
	            dfs(numbers, depth + 1, target, sum + numbers[depth]);
	            dfs(numbers, depth + 1, target, sum - numbers[depth]);
	        }
	    }
	}
	public static void main(String[] args) {
		int[] numbers = {1, 1, 1, 1, 1};
		int target = 3;
		System.out.println(Solution.solution(numbers, target));
	}
}
