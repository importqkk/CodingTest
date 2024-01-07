package programmers.q12906;
import java.util.Stack;

// Lv.1 같은 숫자는 싫어
// https://school.programmers.co.kr/learn/courses/30/lessons/12906
public class Main2 {
	public class Solution {
	    public static Stack<Integer> solution(int[] arr) {
	    	Stack<Integer> answer = new Stack<>();
	    	for(int a: arr) if(answer.size() == 0 || answer.peek() != a) answer.add(a);
	    	return answer;
	    }
	}
	public static void main(String[] args) {
		int[] arr = {4,4,4,3,3};
		Stack<Integer> result = Solution.solution(arr);
		for(int r: result) System.out.println(r);
	}
}
