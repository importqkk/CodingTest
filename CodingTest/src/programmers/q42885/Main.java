package programmers.q42885;
import java.util.Arrays;

// Lv.2 구명보트
// https://school.programmers.co.kr/learn/courses/30/lessons/42885
public class Main {
	class Solution {
	    public static int solution(int[] people, int limit) {
	        int answer = 0, r = people.length - 1, l = 0, sum = 0;
	        Arrays.sort(people);
	        while(r >= l) {
	        	sum = people[r];
	        	if(sum + people[l] <= limit) l++;
	        	r--; answer++;
	        }
	        return answer;
	    }
	}
	public static void main(String[] args) {
		int[] people = {70, 50, 80, 50};
		int limit = 100;
		System.out.println(Solution.solution(people, limit));
	}
}
