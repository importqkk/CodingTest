package programmers.q17680;
import java.util.LinkedList;
import java.util.List;

// Lv.2 [1차] 캐시
// https://school.programmers.co.kr/learn/courses/30/lessons/17680
public class Main {
	class Solution {
	    public static int solution(int cacheSize, String[] cities) {
	        int answer = 0;
	        List<String> list = new LinkedList<>();
	        if(cacheSize == 0) return cities.length * 5;
	        for(String city: cities) {
	        	String c = city.toLowerCase();
	        	if(list.contains(c)) {
	        		list.remove(c);
        			answer += 1;
	        	} else {
	        		if(list.size() >= cacheSize) list.remove(0);
        			answer += 5;
	        	}
	        	list.add(c);
	        }
	        return answer;
	    }
	}
	public static void main(String[] args) {
		int cacheSize = 3;
		String[] cities = {"Jeju", "Pangyo", "Seoul", "NewYork", "LA", "Jeju", "Pangyo", "Seoul", "NewYork", "LA"};
		System.out.println(Solution.solution(cacheSize, cities));
	}
}
