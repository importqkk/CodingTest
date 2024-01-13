package programmers.q250137;

// 주석 버전
// Lv.1 [PCCP 기출문제] 1번 / 붕대 감기 
// https://school.programmers.co.kr/learn/courses/30/lessons/250137
public class Main2 {
	class Solution {
	    public static int solution(int[] bandage, int health, int[][] attacks) {
	        int answer = health, idx = 0, success = 0, point = 0;
	        for(int i=1; i<attacks[attacks.length-1][0]+1; i++) {
	        	System.out.println("-------------------------------");
	        	System.out.println("턴: " + i);
	        	if(i == attacks[idx][0]) {
	        		System.out.println("공격받은 경우");
	        		System.out.println(">> 공격 시간: " + attacks[idx][0]);
	        		System.out.println(">> 받은 공격: " + attacks[idx][1]);
	        		answer -= attacks[idx][1];
	        		success = 0;
	        		idx++;
	        		System.out.println(">> 성공 횟수: " + success);
	        		System.out.println("남은 체력: " + answer);
	        	} else {
	        		System.out.println("붕대 감는 경우");
	        		success++;
	        		System.out.println(">> 성공 횟수: " + success);
	        		if(success < bandage[0]) point = bandage[1];
	        		else {
	        			point = bandage[1] + bandage[2];
	        			success = 0;
	        		}
	        		answer = (answer + point >= health) ? health : answer + point;
	        		System.out.println("회복 후 체력: " + answer);
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
		System.out.println("========= 테스트 케이스 1 =========");
		System.out.println("답: 5 -> " + Solution.solution(bandage1, health1, attacks1));
		System.out.println();
		
		int[] bandage2 = {3, 2, 7};
		int health2 = 20;
		int[][] attacks2 = {{1, 15}, {5, 16}, {8, 6}};
		System.out.println("========= 테스트 케이스 2 =========");
		System.out.println("답: -1 -> " + Solution.solution(bandage2, health2, attacks2));
		System.out.println();
		
		int[] bandage3 = {4, 2, 7};
		int health3 = 20;
		int[][] attacks3 = {{1, 15}, {5, 16}, {8, 6}};
		System.out.println("========= 테스트 케이스 3 =========");
		System.out.println("답: -1 -> " + Solution.solution(bandage3, health3, attacks3));
		System.out.println();
		
		int[] bandage4 = {1, 1, 1};
		int health4 = 5;
		int[][] attacks4 = {{1, 2}, {3, 2}};
		System.out.println("========= 테스트 케이스 4 =========");
		System.out.println("답: 3 -> " + Solution.solution(bandage4, health4, attacks4));
		System.out.println();
	}
}
