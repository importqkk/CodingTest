package programmers.q147355;

//Lv.1 크기가 작은 부분 문자열
//https://school.programmers.co.kr/learn/courses/30/lessons/147355
public class Main {
	class Solution {
	    public static int solution(String t, String p) {
	        int pSize = p.length(), answer = 0;
	        long pLong = Long.parseLong(p), tmp = 0;
	        for(int i=0; i<=t.length()-pSize; i++) {
	        	tmp = Long.parseLong(t.substring(i, i+pSize));
	        	if(tmp <= pLong) answer++;
	        }
	        return answer;
	    }
	}
	public static void main(String[] args) {
		String t = "10203";
		String p = "15";
		System.out.println(Solution.solution(t, p));
	}
}
