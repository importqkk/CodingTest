package programmers.q12935;
import java.util.Arrays;

// Lv.1 제일 작은 수 제거하기
// https://school.programmers.co.kr/learn/courses/30/lessons/12935
public class Main2 {
	class Solution {
	    public static int[] solution(int[] arr) {
	    	if(arr.length == 1) return new int[] {-1};
	    	int min = Arrays.stream(arr).min().getAsInt();
	    	return Arrays.stream(arr).filter(i -> i != min).toArray();
	    }
	}
	public static void main(String[] args) {
		int[] arr = {4, 3, 2, 1};
		int[] result = Solution.solution(arr);
		for(int r: result) System.out.println(r);
	}
}
