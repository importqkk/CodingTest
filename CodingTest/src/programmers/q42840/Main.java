package programmers.q42840;
import java.util.Map;
import java.util.TreeMap;

// Lv.1 모의고사
// https://school.programmers.co.kr/learn/courses/30/lessons/42840
public class Main {
	class Solution {
	    public static int[] solution(int[] answers) {
	    	Map<Integer, Integer> answer = new TreeMap<>();
	    	int[] s1 = {1, 2, 3, 4, 5};
	    	int[] s2 = {2, 1, 2, 3, 2, 4, 2, 5};
	    	int[] s3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
	    	int cnt1=0, cnt2=0, cnt3=0, idx1=0, idx2=0, idx3=0;
	    	for(int i=0; i<answers.length; i++) {
	    		if(s1[idx1] == answers[i]) cnt1++;
	    		if(s2[idx2] == answers[i]) cnt2++;
	    		if(s3[idx3] == answers[i]) cnt3++;
	    		if(idx1 < s1.length-1) idx1++;
	    		else idx1 = 0;
	    		if(idx2 < s2.length-1) idx2++;
	    		else idx2 = 0;
	    		if(idx3 < s3.length-1) idx3++;
	    		else idx3 = 0;
	    	}
	    	answer.put(1, cnt1); answer.put(2, cnt2); answer.put(3, cnt3);
	    	cnt1 = answer.get(1); cnt2 = answer.get(2); cnt3 = answer.get(3);
	    	if(cnt1 < cnt2 || cnt1 < cnt3) answer.remove(1);
	    	if(cnt2 < cnt1 || cnt2 < cnt3) answer.remove(2);
	    	if(cnt3 < cnt2 || cnt3 < cnt1) answer.remove(3);
	        return answer.keySet().stream().mapToInt(i -> i).toArray();
	    }
	}
	public static void main(String[] args) {
		int[] answers = {1,3,2,4,2};
		int[] result = Solution.solution(answers);
		for(int r: result) System.out.println(r);
	}
}
