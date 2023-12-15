package programmers.q12948;

// Lv.1 핸드폰 번호 가리기
// https://school.programmers.co.kr/learn/courses/30/lessons/12948
public class Main {
	class Solution {
	    public static String solution(String phone_number) {
	        StringBuilder sb = new StringBuilder();
	    	for(int i=0; i<phone_number.length()-4; i++) sb.append("*");
	    	return sb.append(phone_number.substring(phone_number.length()-4)).toString();
	    }
	}
	public static void main(String[] args) {
		String phoneNumber = "027778888";
		System.out.println(Solution.solution(phoneNumber));
	}
}
