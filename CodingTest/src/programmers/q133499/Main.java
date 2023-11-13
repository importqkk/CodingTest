package programmers.q133499;

// Lv.1 옹알이 (2)
// https://school.programmers.co.kr/learn/courses/30/lessons/133499
public class Main {
	class Solution {
	    public static int solution(String[] babbling) {
	        int answer = 0;
	        for(String b: babbling) {
	        	if(b.contains("ayaaya") || b.contains("yeye") || 
	        	   b.contains("woowoo")||b.contains("mama")) continue;
	        	b = b.replaceAll("aya|ye|woo|ma", "");
	        	if(b.length() == 0) answer++;
	        }
	        return answer;
	    }
	}
	public static void main(String[] args) {
//		String[] babbling = {"aya", "yee", "u", "maa"};
		String[] babbling = {"ayaye", "uuu", "yeye", "yemawoo", "ayaayaa"};
		System.out.println(Solution.solution(babbling));
	}
}
