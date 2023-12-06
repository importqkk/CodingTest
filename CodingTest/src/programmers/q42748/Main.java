package programmers.q42748;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Lv.1 K번째수
// https://school.programmers.co.kr/learn/courses/30/lessons/42748
public class Main {
	class Solution {
	    public static int[] solution(int[] array, int[][] commands) {
	        int[] answer = new int[commands.length];
	        List<Integer> list;
	        for(int i=0; i<commands.length; i++) {
	        	list = new ArrayList<>();
	        	for(int j=commands[i][0]-1; j<=commands[i][1]-1; j++) list.add(array[j]);
	        	Collections.sort(list);
	        	answer[i] = list.get(commands[i][2]-1);
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
