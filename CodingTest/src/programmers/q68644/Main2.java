package programmers.q68644;
import java.util.Set;
import java.util.TreeSet;

// Lv.1 두 개 뽑아서 더하기
// https://school.programmers.co.kr/learn/courses/30/lessons/68644
public class Main2 {
	class Solution {
	    public static int[] solution(int[] numbers) {
	        Set<Integer> answer = new TreeSet<>();
	        for(int i=0; i<numbers.length-1; i++) 
	        	for(int j=i+1; j<numbers.length; j++) answer.add(numbers[i] + numbers[j]);
	        return answer.stream().mapToInt(i -> i).toArray();
	    }
	}
	public static void main(String[] args) {
		int[] numbers = {2,1,3,4,1};
		int[] result = Solution.solution(numbers);
		for(int r: result) System.out.println(r);
	}
}
