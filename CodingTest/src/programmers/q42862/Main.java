package programmers.q42862;

// Lv.1 체육복
// https://school.programmers.co.kr/learn/courses/30/lessons/42862
// TC 13, 18 오답
public class Main {
	class Solution {
	    public static int solution(int n, int[] lost, int[] reserve) {
	        int answer = n-lost.length;
	        for(int i=0; i<lost.length; i++) for(int j=0; j<reserve.length; j++) {
	        	if(lost[i] == reserve[j]) {
	        		lost[i] = -1;
	        		reserve[j] = -1;
	        		answer++;
	        		break;
	        	}
	        }
	        for(int i=0; i<lost.length; i++) for(int j=0; j<reserve.length; j++) {
	        	if(lost[i]!=-1 && reserve[j]!=-1 && (lost[i]==reserve[j]-1 || lost[i]==reserve[j]+1)) {
	        		lost[i] = -1;
	        		reserve[j] = -1;
	        		answer++;
	        		break;
	        	}
	        }
	        return answer;
	    }
	}
	public static void main(String[] args) {
		int n = 5;
		int[] lost = {4, 5};
		int[] reserve = {3, 4};
		System.out.println(Solution.solution(n, lost, reserve));
	}
}
