package programmers.q64061;
import java.util.Stack;

//Lv.1 크레인 인형뽑기 게임
//https://school.programmers.co.kr/learn/courses/30/lessons/64061
public class Main2 {
	class Solution {
	    public static int solution(int[][] board, int[] moves) {
	    	int doll=0, answer = 0;
	    	Stack<Integer> bucket = new Stack<>();
	    	for(int m: moves) for(int i=0; i<board.length; i++) {
	    		if(board[i][m-1] == 0) continue;
	    		doll = board[i][m-1];
	    		if(!bucket.isEmpty() && bucket.peek()==doll) {
	    			bucket.pop();
	    			answer += 2;
	    		} 
	    		else bucket.add(doll);
	    		board[i][m-1] = 0;
    			break;
	    	}
	        return answer;
	    }
	}
	public static void main(String[] args) {
//		int[][] board = {{0,0,0,0,0},
//						 {0,0,1,0,3},
//						 {0,2,5,0,1},
//						 {4,2,4,4,2},
//						 {3,5,1,3,1}};
//		int[] moves = {1,5,3,5,1,2,1,4};
		int[][] board = {{0, 0, 0, 0},
				{0, 0, 0, 0},
				{0, 0, 0, 0},
				{0, 0, 0, 0}};
		int[] moves = {1, 2, 3, 4};
		System.out.println(Solution.solution(board, moves));
	}
}
