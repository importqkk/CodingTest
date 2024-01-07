package programmers.q12906;
import java.util.ArrayList;
import java.util.List;

// Lv.1 같은 숫자는 싫어
// https://school.programmers.co.kr/learn/courses/30/lessons/12906
public class Main {
	public class Solution {
	    public static int[] solution(int[] arr) {
	    	List<Integer> temp = new ArrayList<>();
	    	temp.add(arr[0]);
	    	for(int i=1; i<arr.length; i++) if (arr[i] != arr[i-1]) temp.add(arr[i]);
	    	int[] answer = new int[temp.size()];
	    	for(int i=0; i<temp.size(); i++) answer[i] = temp.get(i);
	    	return answer;
	    }
	}
	public static void main(String[] args) {
		int[] arr = {4,4,4,3,3};
		int[] result = Solution.solution(arr);
		for(int r: result) System.out.println(r);
	}
}
