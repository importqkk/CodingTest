package programmers.q140108;

// Lv.1 문자열 나누기
// https://school.programmers.co.kr/learn/courses/30/lessons/140108
public class Main {
	class Solution {
	    public static int solution(String s) {
	        return calc(s, 0);
	    }
	    public static int calc(String s, int answer) {
	    	if(s.length() == 0) return answer;
	    	int cnt1 = 1, cnt2 = 0;
			for(int i=1; i<s.length(); i++) {
				if(s.charAt(i) == s.charAt(0)) cnt1++;
				else cnt2++;
				if(cnt1 == cnt2) return calc(s.substring(i+1), answer+1);
			}
			return answer + 1;
		}
	}
	public static void main(String[] args) {
		String s = "abracadabra";
		System.out.println(Solution.solution(s));
	}
}
