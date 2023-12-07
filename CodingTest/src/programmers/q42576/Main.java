package programmers.q42576;
import java.util.ArrayList;
import java.util.List;

// Lv.1 완주하지 못한 선수
// https://school.programmers.co.kr/learn/courses/30/lessons/42576
// 효율성 테스트 실패
public class Main {
	class Solution {
	    public static String solution(String[] participant, String[] completion) {
	        List<String> list = new ArrayList<>();
	        for(int i=0; i<participant.length; i++) list.add(participant[i]);
	        for(int i=0; i<completion.length; i++) list.remove(completion[i]);
	        return list.get(0);
	    }
	}
	public static void main(String[] args) {
		String[] participant = {"mislav", "stanko", "mislav", "ana"};
		String[] completion = {"stanko", "ana", "mislav"};
		System.out.println(Solution.solution(participant, completion));
	}
}
