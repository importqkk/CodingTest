package programmers.q42748;
import java.util.Arrays;

// Lv.1 K번째수
// https://school.programmers.co.kr/learn/courses/30/lessons/42748
public class Main2 {
	class Solution {
	    public static int[] solution(int[] array, int[][] commands) {
	        int[] answer = new int[commands.length];
	        for(int i=0; i<commands.length; i++) {
	        	int[] tmpArr = Arrays.copyOfRange(array, commands[i][0]-1, commands[i][1]);
	        	Arrays.sort(tmpArr);
	        	answer[i] = tmpArr[commands[i][2]-1];
	        }
	        return answer;
	    }
	}
	public static void main(String[] args) {
		int[] array = {1, 5, 2, 6, 3, 7, 4};
		int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
		int[] result = Solution.solution(array, commands);
		for(int r: result) System.out.println(r);
	}
}
