package programmers.q142086;

// Lv.1 가장 가까운 같은 글자
// https://school.programmers.co.kr/learn/courses/30/lessons/142086
public class Main {
	class Solution {
	    public static int[] solution(String s) {
	        int[] answer = new int[s.length()];
	        int[] alphabet = new int[26];
	        char w;
	        for(int i=0; i<s.length(); i++) {
	        	w = s.charAt(i);
	        	if(alphabet[w - 'a'] == 0) answer[i] = -1;
	        	else answer[i] = i - alphabet[w - 'a'] + 1;
	        	alphabet[w - 'a'] = i + 1;
	        }
	        return answer;
	    }
	}
	public static void main(String[] args) {
		String s = "foobar";
		int[] answer = Solution.solution(s);
		for(int a: answer) System.out.println(a);
	}
}
