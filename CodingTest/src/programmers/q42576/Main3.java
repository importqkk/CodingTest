package programmers.q42576;

//Lv.1 완주하지 못한 선수
//https://school.programmers.co.kr/learn/courses/30/lessons/42576
//효율성 테스트 실패
public class Main3 {
	class Solution {
	    public static String solution(String[] participant, String[] completion) {
	    	String answer = "";
	    	for(int i=0; i<completion.length; i++) for(int j=0; j<participant.length; j++) {
    			if(completion[i].equals(participant[j])) {
    				participant[j] = "";
    				break;
    			}
	    	}
	    	for(int i=0; i<participant.length; i++) if(!participant[i].equals("")) answer = participant[i];
	    	return answer;
	    }
	}
	public static void main(String[] args) {
		String[] participant = {"mislav", "stanko", "mislav", "ana"};
		String[] completion = {"stanko", "ana", "mislav"};
		System.out.println(Solution.solution(participant, completion));
	}
}
