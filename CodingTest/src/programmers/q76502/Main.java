package programmers.q76502;
import java.util.Stack;

// Lv.2 괄호 회전하기
// https://school.programmers.co.kr/learn/courses/30/lessons/76502
public class Main {
    static class Solution {
        public static int solution(String s) {
            int answer = 0;
            for(int i = 0; i < s.length(); i++) {
                if(isCorrect(s)) answer++;
                s = s.substring(1) + s.charAt(0);
            }
            return answer;
        }
        private static boolean isCorrect(String s) {
            Stack<Character> stack = new Stack<>();
            char pop;
            for(char c : s.toCharArray()) {
                if (c == '(' || c == '[' || c == '{') stack.push(c);
                else {
                    if(stack.isEmpty()) return false;
                    pop = stack.pop();
                    if((pop == '(' && c != ')') || (pop == '[' && c != ']') || (pop == '{' && c != '}')) return false;
                }
            }
            return stack.isEmpty();
        }
    }
	public static void main(String[] args) {
		String s = "[)(]";
		System.out.println(Solution.solution(s));
	}
}
