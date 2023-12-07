package programmers.q42576;
import java.util.Arrays;

//Lv.1 완주하지 못한 선수
//https://school.programmers.co.kr/learn/courses/30/lessons/42576
public class Main2 {
	class Solution {
	    public static String solution(String[] participant, String[] completion) {
	    	Arrays.sort(participant); Arrays.sort(completion);
	    	for(int i=0; i<completion.length; i++) if(!participant[i].equals(completion[i])) return participant[i];
	    	return participant[participant.length-1];
	    }
	}
	public static void main(String[] args) {
		String[] participant = {"mislav", "stanko", "mislav", "ana"};
		String[] completion = {"stanko", "ana", "mislav"};
		System.out.println(Solution.solution(participant, completion));
	}
}
