package programmers.q250125;

// Lv.1 [PCCE 기출문제] 9번 / 이웃한 칸
// https://school.programmers.co.kr/learn/courses/30/lessons/250125
public class Main {
	class Solution {
	    public static int solution(String[][] board, int h, int w) {
	        int n = board.length, cnt = 0, hCheck = 0, wCheck = 0;
	        int[] dh = {0, 1, -1, 0}, dw = {1, 0, 0, -1};
	        for(int i=0; i<4; i++) {
	        	hCheck = h + dh[i];
	        	wCheck = w + dw[i];
	        	if((hCheck>=0 && hCheck<n) && (wCheck>=0 && wCheck<n)) 
	        		if(board[h][w].equals(board[hCheck][wCheck])) cnt++;
	        }
	        return cnt;
	    }
	}
	public static void main(String[] args) {
		String[][] board = {{"yellow", "green", "blue"}, {"blue", "green", "yellow"}, {"yellow", "blue", "blue"}};
		int h = 0, w = 1;
		System.out.println(Solution.solution(board, h, w));
	}
}
