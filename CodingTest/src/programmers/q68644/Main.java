package programmers.q68644;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Lv.1 두 개 뽑아서 더하기
// https://school.programmers.co.kr/learn/courses/30/lessons/68644
public class Main {
	class Solution {
	    public static int[] solution(int[] numbers) {
	        List<Integer> answer = new ArrayList<>();
	        for(int i=0; i<numbers.length-1; i++) for(int j=i+1; j<numbers.length; j++) 
	        	if(!answer.contains(numbers[i] + numbers[j])) answer.add(numbers[i] + numbers[j]);
	        Collections.sort(answer);
	        return answer.stream().mapToInt(i -> i).toArray();
	    }
	}
	public static void main(String[] args) {
		int[] numbers = {2,1,3,4,1};
		int[] result = Solution.solution(numbers);
		for(int r: result) System.out.println(r);
	}
}
