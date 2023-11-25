package programmers.q77484;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

// Lv.1 로또의 최고 순위와 최저 순위
// https://school.programmers.co.kr/learn/courses/30/lessons/77484
public class Main {
	class Solution {
	    public static int[] solution(int[] lottos, int[] win_nums) {
	        int[] answer = new int[2];
	        int zero = 0, cnt = 0;
	        Map<Integer, Integer> map = new HashMap<>();
	        map.put(6, 1); map.put(5, 2); map.put(4, 3); map.put(3, 4); map.put(2, 5);
	        Arrays.sort(lottos); Arrays.sort(win_nums);
	        for(int i=0; i<lottos.length; i++) {
	        	if(lottos[i] == 0) {
	        		zero++; continue;
	        	}
	        	for(int j=0; j<win_nums.length; j++) {
	        		if(lottos[i] == win_nums[j]) cnt++;
	        	}
	        }
	        System.out.println("cnt: " + cnt);
	        System.out.println("zero: " + zero);
	        answer[0] = zero+cnt<2 ? 6 : map.get(zero+cnt);
	        answer[1] = cnt<2 ? 6 : map.get(cnt);
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
