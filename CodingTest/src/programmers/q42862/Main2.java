package programmers.q42862;

// Lv.1 체육복
// https://school.programmers.co.kr/learn/courses/30/lessons/42862
public class Main2 {
	class Solution {
	    public static int solution(int n, int[] lost, int[] reserve) {
	    	int answer = n;
	        int[] arr = new int[n];
	        for(int l: lost) arr[l-1]--;
	        for(int r: reserve) arr[r-1]++;
	        for(int i=0; i<n; i++) if(arr[i] == -1) {
	        	if(i-1 >= 0 && arr[i-1] == 1) {
	        		arr[i]++;
	        		arr[i-1]--;
	        	} else if(i+1 < n && arr[i+1] == 1) {
	        		arr[i]++;
	        		arr[i+1]--;
	        	} else answer--;
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
