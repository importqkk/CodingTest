package programmers.q12910;
import java.util.Set;
import java.util.TreeSet;

// Lv.1 나누어 떨어지는 숫자 배열
// https://school.programmers.co.kr/learn/courses/30/lessons/12910
public class Main {
	class Solution {
	    public static int[] solution(int[] arr, int divisor) {
	        Set<Integer> answer = new TreeSet<>();
	        for(int i=0; i<arr.length; i++) if(arr[i] % divisor == 0) answer.add(arr[i]);
	        if(answer.isEmpty()) answer.add(-1);
	        return answer.stream().mapToInt(i -> i).toArray();
	    }
	}
	public static void main(String[] args) {
		int[] arr = {3,2,6};
		int divisor = 10;
		int[] result = Solution.solution(arr, divisor);
		for(int r: result) System.out.println(r);
	}
}
