package programmers.q84512;

// Lv.2 모음사전
// https://school.programmers.co.kr/learn/courses/30/lessons/84512
public class Main {
	class Solution {
		private static int cnt = 0;
		private static int answer = 0;
	    public static int solution(String word) {
	    	String[] words = {"A", "E", "I", "O", "U"};
            dfs("", word, words);
            return answer - 1;
	    }
	    public static void dfs(String str, String word, String[] words) {
	    	cnt++;
            if(str.equals(word)) answer = cnt;
            if(str.length() == 5 || answer != 0) return;
            for(String w : words) dfs(str + w, word, words);
	    }
	}
	public static void main(String[] args) {
		String word = "AAAE";
		System.out.println(Solution.solution(word));
	}
}
