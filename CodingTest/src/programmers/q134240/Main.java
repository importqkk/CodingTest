package programmers.q134240;

public class Main {
	class Solution {
	    public static String solution(int[] food) {
	        StringBuilder answer = new StringBuilder();
	        for(int i=1; i<food.length; i++) {
	        	if(food[i] % 2 != 0) food[i] -= 1;
	        	for(int j=0; j<food[i]/2; j++) answer.append(i);
	        }
	        answer.append("0");
	        for(int i=answer.length()-2; i>=0; i--) answer.append(answer.charAt(i));
	        return answer.toString();
	    }
	}
	public static void main(String[] args) {
		int[] food = {1, 3, 4, 6};
//		int[] food = {1, 7, 1, 2};
		System.out.println(Solution.solution(food));
	}
}
