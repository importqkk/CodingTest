package programmers.q250137;

// Lv.1 [PCCP 기출문제] 1번 / 붕대 감기 
// https://school.programmers.co.kr/learn/courses/30/lessons/250137
public class Main {
	class Solution {
	    public static int solution(int[] bandage, int health, int[][] attacks) {
	        int answer = health, idx = 0, success = 0, point = 0;
	        for(int i=1; i<attacks[attacks.length-1][0]+1; i++) {
	        	if(i == attacks[idx][0]) {
	        		answer -= attacks[idx][1];
	        		success = 0;
	        		idx++;
	        	} else {
	        		success++;
	        		if(success < bandage[0]) point = bandage[1];
	        		else {
	        			point = bandage[1] + bandage[2];
	        			success = 0;
	        		}
	        		answer = (answer + point >= health) ? health : answer + point;
	        	}
	        	if(answer <= 0) return -1;
	        }
	        return answer;
	    }
	}
	public static void main(String[] args) {
		int[] bandage1 = {5, 1, 5};
		int health1 = 30;
		int[][] attacks1 = {{2, 10}, {9, 15}, {10, 5}, {11, 5}};
		System.out.println(Solution.solution(bandage1, health1, attacks1));
	}
}
