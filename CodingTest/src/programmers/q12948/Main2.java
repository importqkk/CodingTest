package programmers.q12948;

// Lv.1 핸드폰 번호 가리기
// https://school.programmers.co.kr/learn/courses/30/lessons/12948
public class Main2 {
	class Solution {
	    public static String solution(String phone_number) {
	        char[] answer = phone_number.toCharArray();
	        for(int i=0; i<answer.length-4; i++) answer[i] = '*';
	        return String.valueOf(answer);
	    }
	}
	public static void main(String[] args) {
		String phoneNumber = "027778888";
		System.out.println(Solution.solution(phoneNumber));
	}
}