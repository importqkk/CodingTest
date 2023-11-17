package programmers.q118666;
import java.util.HashMap;
import java.util.Map;

// Lv.1 성격 유형 검사하기
// https://school.programmers.co.kr/learn/courses/30/lessons/118666
public class Main {
	class Solution {
	    public static String solution(String[] survey, int[] choices) {
	        StringBuilder answer = new StringBuilder();
	        Map<Integer, Integer> score = new HashMap<>();
	        Map<Character, Integer> type = new HashMap<>();
	        char tmp1, tmp2;
	        for(int i=1; i<=7; i++) {
	        	switch(i) {
					case 1: case 7: score.put(i, 3); break;
					case 2: case 6: score.put(i, 2); break;
					case 3: case 5: score.put(i, 1); break;
					case 4: score.put(i, 0); break;
				}
	        }
	        for(int i=0; i<survey.length; i++) {
	        	tmp1 = survey[i].charAt(0);
	        	tmp2 = survey[i].charAt(1);
	        	if(choices[i] < 4) {
	        		if(type.containsKey(tmp1)) type.put(tmp1, type.getOrDefault(tmp1, 0) + score.get(choices[i]));
	        		else type.put(tmp1, score.get(choices[i]));
	        	} else if(choices[i] > 4) {
	        		if(type.containsKey(tmp2)) type.put(tmp2, type.getOrDefault(tmp2, 0) + score.get(choices[i]));
	        		else type.put(tmp2, score.get(choices[i]));
	        	} else continue;
	        }
	        answer.append(calc('R', 'T', type));
	        answer.append(calc('C', 'F', type));
	        answer.append(calc('J', 'M', type));
	        answer.append(calc('A', 'N', type));
	        return answer.toString();
	    }
	    private static char calc(char a, char b, Map<Character, Integer> type) {
	    	if(type.getOrDefault(a, 0) > type.getOrDefault(b, 0)) return a;
	        else if(type.getOrDefault(a, 0) < type.getOrDefault(b, 0)) return b;
	    	return a - b > 0 ? b : a;
	    }
	}
	public static void main(String[] args) {
		String[] survey = {"TR", "RT", "TR"};
		int[] choices = {7, 1, 3};
		System.out.println(Solution.solution(survey, choices));
	}
}
