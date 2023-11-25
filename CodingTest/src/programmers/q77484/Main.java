package programmers.q77484;

// Lv.1 로또의 최고 순위와 최저 순위
// https://school.programmers.co.kr/learn/courses/30/lessons/77484
public class Main {
	class Solution {
	    public static int[] solution(int[] lottos, int[] win_nums) {
	        int[] answer = new int[2];
	        int zero = 0, cnt = 0;
	        for(int i=0; i<lottos.length; i++) {
	        	if(lottos[i] == 0) {
	        		zero++; continue;
	        	}
	        	for(int j=0; j<win_nums.length; j++) {
	        		if(lottos[i] == win_nums[j]) cnt++;
	        	}
	        }
	        answer[0] = zero+cnt<2 ? 6 : 7-(zero+cnt);
	        answer[1] = cnt<2 ? 6 : 7-cnt;
	        return answer;
	    }
	}
	public static void main(String[] args) {
		int[] lottos = {0, 0, 0, 0, 0, 0};
		int[] winNums = {38, 19, 20, 40, 15, 25};
		int[] result = Solution.solution(lottos, winNums);
		for(int r: result) System.out.println(r);
	}
}
