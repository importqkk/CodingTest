package programmers.q64061;
import java.util.Stack;

// Lv.1 크레인 인형뽑기 게임
// https://school.programmers.co.kr/learn/courses/30/lessons/64061
public class Main {
	class Solution {
	    public static int solution(int[][] board, int[] moves) {
	    	int crane, craneIdx=-1, doll=0, boardIdx=0, answer = 0;
	    	Stack<Integer> bucket = new Stack<>();
	    	while(++craneIdx < moves.length) {
	    		crane = moves[craneIdx]-1;
	    		while(true) {	
	    			doll = board[boardIdx][crane];
	    			if(doll > 0) {
	    				board[boardIdx][crane] = 0;
	    				break;
	    			}
	    			boardIdx++;
	    			if(boardIdx >= board.length) break;
	    		}
	    		boardIdx = 0;
	    		if(doll == 0) continue;
	    		if(!bucket.isEmpty() && bucket.peek()==doll) {
	    			bucket.pop();
	    			answer += 2;
	    		}
	    		else bucket.add(doll);
	    	}
	        return answer;
	    }
	}
	public static void main(String[] args) {
		int[][] board = {{0, 0, 0, 0},
						 {0, 0, 0, 0},
						 {0, 0, 0, 0},
						 {0, 0, 0, 0}};
		int[] moves = {1, 2, 3, 4};
		System.out.println(Solution.solution(board, moves));
	}
}
