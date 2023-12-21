package programmers.q12935;
import java.util.ArrayList;
import java.util.List;

// Lv.1 제일 작은 수 제거하기
// https://school.programmers.co.kr/learn/courses/30/lessons/12935
public class Main {
	class Solution {
	    public static int[] solution(int[] arr) {
	    	if(arr.length == 1) return new int[] {-1};
	    	List<Integer> tmp = new ArrayList<>();
	    	int min = Integer.MAX_VALUE;
	    	for(int i=0; i<arr.length; i++) {
	    		if(arr[i] < min) min = arr[i];
	    		tmp.add(arr[i]);
	    	}
	    	tmp.remove(tmp.indexOf(min));
	    	return tmp.stream().mapToInt(i -> i).toArray();
	    }
	}
	public static void main(String[] args) {
		int[] arr = {4, 3, 2, 1};
		int[] result = Solution.solution(arr);
		for(int r: result) System.out.println(r);
	}
}
