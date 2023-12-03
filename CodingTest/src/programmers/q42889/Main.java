package programmers.q42889;
import java.util.HashMap;
import java.util.Map;

// Lv.1 실패율
// https://school.programmers.co.kr/learn/courses/30/lessons/42889
public class Main {
	class Solution {
	    public static int[] solution(int N, int[] stages) {
	    	Map<Integer, Double> map = new HashMap<>();
	    	double stay=0, clear=0, max;
	    	int stage = 0;
	    	int[] answer = new int[N];
	    	for(int i=1; i<=N; i++) {
	    		for(int j=0; j<stages.length; j++) {
	    			if(stages[j] == i) stay++;
	    			if(stages[j] >= i) clear++;
	    		}
	    		if(clear==0 && stay==0) clear=1;
	    		map.put(i, stay/clear);
	    		stay = 0;
	    		clear = 0;
	    	}
	    	for (int i = 0; i < N; i++) {
	            max = -1;
	            for(int k : map.keySet()) if(max < map.get(k)) {
                   max = map.get(k);
                   stage = k;
	            }
	            answer[i] = stage;
	            map.remove(stage);
	        }
	        return answer;
	    }
	}
	public static void main(String[] args) {
		int n = 5;
		int[] stages = {2, 1, 2, 6, 2, 4, 3, 3};
		int[] result = Solution.solution(n, stages);
		for(int r: result) System.out.println(r);
	}
}
