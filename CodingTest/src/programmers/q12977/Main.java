package programmers.q12977;

// Lv.1 소수 만들기
// https://school.programmers.co.kr/learn/courses/30/lessons/12977
public class Main {
	class Solution {
	    public static int solution(int[] nums) {
	        int answer = 0, n, cnt;
	        for(int i=0; i<nums.length-2; i++) for(int j=i+1; j<nums.length-1; j++) for(int k=j+1; k<nums.length; k++) {
        		n = nums[i] + nums[j] + nums[k];
        		cnt = 0;
        		for(int q=1; q<=n; q++) if(n % q == 0) cnt++;
        		if(cnt == 2) answer++;
	        }
	        return answer;
	    }
	}
	public static void main(String[] args) {
		int[] nums = {1,2,7,6,4};
		System.out.println(Solution.solution(nums));
	}
}
