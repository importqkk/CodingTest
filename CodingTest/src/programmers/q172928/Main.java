package programmers.q172928;
import java.util.StringTokenizer;

// Lv.1 공원 산책
// https://school.programmers.co.kr/learn/courses/30/lessons/172928
public class Main {
	class Solution {
	    public static int[] solution(String[] park, String[] routes) {
	    	char[][] board = new char[park.length][park[0].length()];
	    	int currentX=0, currentY=0, dist, newX, newY;
	    	String dir=null;
	    	StringTokenizer st;
	    	
	    	for(int i=0; i<park.length; i++) {
	    		board[i] = park[i].toCharArray();
	    		if(park[i].contains("S")) {	    			
	    			currentX = park[i].indexOf("S");
	    			currentY = i;
	    		}
	    	}
	    	
	    	for(String r: routes) {
	    		st = new StringTokenizer(r, " ");
	    		dir = st.nextToken();
	    		dist = Integer.parseInt(st.nextToken());
	    		newX = currentX;
	    		newY = currentY;
	    		for(int i=0; i<dist; i++) {
	    			switch (dir) {
						case "E": newX++; break;
						case "W": newX--; break;
						case "S": newY++; break;
						case "N": newY--; break;
					}
	    			if(newX>=0 && newY>=0 && newY<board.length && newX<board[0].length) {
	    				if(board[newY][newX] == 'X') break;
	    				if(i == dist-1) {
		    				currentX = newX;
		    				currentY = newY;
		    			}
	    			}
	    		}
	    	}
	    	
	    	int[] answer = {currentY, currentX};
	        return answer;
	    }
	}
	public static void main(String[] args) {
		String[] park = {"SOO","OOO","OOO"};
		String[] routes = {"E 2","S 2","W 1"};
		int[] answer = Solution.solution(park, routes);
		System.out.println(answer[0]+ ", " + answer[1]);
	}
}
