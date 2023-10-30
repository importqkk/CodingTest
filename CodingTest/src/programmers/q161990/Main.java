package programmers.q161990;

// Lv.1 바탕화면 정리
// https://school.programmers.co.kr/learn/courses/30/lessons/161990
public class Main {
	class Solution {
	    public static int[] solution(String[] wallpaper) {
	    	int lux=Integer.MAX_VALUE, luy=Integer.MAX_VALUE, rdx=Integer.MIN_VALUE, rdy=Integer.MIN_VALUE;
	    	for(int i=0; i<wallpaper.length; i++) {
	    		for(int j=0; j<wallpaper[i].length(); j++) {
	    			if(wallpaper[i].charAt(j) == '#') {
	    				lux = Math.min(lux, i);
	    				luy = Math.min(luy, j);
	    				rdx = Math.max(rdx, i+1);
	    				rdy = Math.max(rdy, j+1);
	    			}
	    		}
	    	}
	    	
	        int[] answer = {lux, luy, rdx, rdy};
	        return answer;
	    }
	}
	public static void main(String[] args) {
		String[] wallpaper = {"..", "#."};
		int[] answer = Solution.solution(wallpaper);
		for(int i=0; i<answer.length; i++) System.out.println(answer[i]);
	}
}
