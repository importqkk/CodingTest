package programmers.q150370;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.StringTokenizer;

// Lv.1 개인정보 수집
// https://school.programmers.co.kr/learn/courses/30/lessons/150370?language=java
public class Main {
	class Solution {
	    public static List<Integer> solution(String today, String[] terms, String[] privacies) {
	        int todayInt = getDays(today, 0), termDay;
	    	HashMap<String, Integer> map = new HashMap<>();
	        StringTokenizer st;
	        String date, type;
	        List<Integer> answer = new ArrayList<>();
	        for(int i=0; i<terms.length; i++) {
	        	st = new StringTokenizer(terms[i], " ");
	        	map.put(st.nextToken(), Integer.parseInt(st.nextToken()));
	        }
	        for(int i=0; i<privacies.length; i++) {
	        	st = new StringTokenizer(privacies[i], " ");
	        	date = st.nextToken();
	        	type = st.nextToken();
	        	termDay = getDays(date, map.get(type)) - 1;
	        	if(termDay < todayInt) answer.add(i+1);
	        }
	        return answer;
	    }
	    public static int getDays(String date, int term) {
	    	StringTokenizer st = new StringTokenizer(date, ".");
	    	int y = Integer.parseInt(st.nextToken());
	    	int m = Integer.parseInt(st.nextToken()) + term;
	    	int d = Integer.parseInt(st.nextToken());
	    	return (y * 12 * 28) + (m * 28) + d;
	    }
	}
	public static void main(String[] args) {
		String today = "2020.01.01";
		String[] terms = {"Z 3", "D 5"};
		String[] privacies = {"2019.01.01 D", "2019.11.15 Z", "2019.08.02 D", "2019.07.01 D", "2018.12.28 Z"};
		List<Integer> answer = Solution.solution(today, terms, privacies);
		for(int a: answer) System.out.println(a);
	}
}
