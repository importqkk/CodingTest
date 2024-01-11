package programmers.q1845;
import java.util.HashSet;

// Lv.1 포켓몬
// https://school.programmers.co.kr/learn/courses/30/lessons/1845
public class Main {
	class Solution {
	    public static int solution(int[] nums) {
	    	int get = nums.length / 2;
	        HashSet<Integer> hash = new HashSet<>();
	        for(int n: nums) hash.add(n);
	        return hash.size() >= get ? get : hash.size();
	    }
	}
	public static void main(String[] args) {
		int[] nums = {3,3,3,2,2,2};
		System.out.println(Solution.solution(nums));
	}
}
