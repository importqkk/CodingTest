package programmers.q133502;
import java.util.Stack;

// Lv.1 햄버거 만들기
// https://school.programmers.co.kr/learn/courses/30/lessons/133502
public class Main {
	class Solution {
	    public static int solution(int[] ingredient) {
	        int answer=0, size=0;
	        Stack<Integer> s = new Stack<>();
	        for(int i=0; i<ingredient.length; i++) {
	        	s.add(ingredient[i]);
	        	size = s.size();
	        	if(size < 4) continue;
        		if(s.get(size-1)==1&&s.get(size-2)==3&&s.get(size-3)==2&&s.get(size-4)==1) {
        			s.pop(); s.pop(); s.pop(); s.pop();
        			answer++;
        		}
	        }
	        return answer;
	    }
	}
	public static void main(String[] args) {
		int[] ingredient = {2, 1, 1, 2, 3, 1, 2, 3, 1};
		System.out.println(Solution.solution(ingredient));
	}
}
