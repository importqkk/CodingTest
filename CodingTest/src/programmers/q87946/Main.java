package programmers.q87946;

// Lv.2 피로도
// https://school.programmers.co.kr/learn/courses/30/lessons/87946
public class Main {
	class Solution {
		private static int max = Integer.MIN_VALUE;
	    public static int solution(int k, int[][] dungeons) {
	        boolean[] visit = new boolean[dungeons.length];
	        dfs(k, dungeons, visit);
	        return max;
	    }
	    private static void dfs(int k, int[][] dungeons, boolean[] visit) {
	    	int cnt = 0;
	    	for(boolean v: visit) if(v) cnt++;
	    	if(cnt > max) max = cnt;
	    	for(int i=0; i<dungeons.length; i++) if(!visit[i]) if(dungeons[i][0] <= k) {
				visit[i] = true;
				k -= dungeons[i][1];
				dfs(k, dungeons, visit);
				k += dungeons[i][1];
				visit[i] = false;
    		}
	    }
	}
	public static void main(String[] args) {
		int k = 80;
		int[][] dungeons = {{80,20},{50,40},{30,10}};
		System.out.println(Solution.solution(k, dungeons));
	}
}
