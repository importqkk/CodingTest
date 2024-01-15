package programmers.q250121;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

// Lv.1 [PCCE 기출문제] 10번 / 데이터 분석
// https://school.programmers.co.kr/learn/courses/30/lessons/250121
public class Main {
	class Solution {
	    public static int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
	        int[][] answer = {};
	        List<int[]> list = new ArrayList<>();
	        int std = calc(ext);
	        final int sort = calc(sort_by);
	        for(int i=0; i<data.length; i++) if(data[i][std] < val_ext) list.add(data[i]);
	        answer = new int[list.size()][3];
	        for(int i=0; i<list.size(); i++) answer[i] = list.get(i); 
	        Arrays.sort(answer, Comparator.comparingInt(arr -> arr[sort]));
	        return answer;
	    }
	    private static int calc(String s) {
	    	switch(s) {
				case "code": return 0;
				case "date": return 1;
				case "maximum": return 2;
				case "remain": return 3;
			}
	    	return 0;
	    }
	}
	public static void main(String[] args) {
		int[][] data = {{1, 20300104, 100, 80}, {2, 20300804, 847, 37}, {3, 20300401, 10, 8}};
		String ext = "date";
		int valExt = 20300501;
		String sortBy = "remain";
		int[][] result = Solution.solution(data, ext, valExt, sortBy);
		for(int[] r: result) for(int i: r) System.out.println(i);
	}
}
