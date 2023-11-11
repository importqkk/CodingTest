package programmers.q134240;

//Lv.1 푸드 파이트 대회
//https://school.programmers.co.kr/learn/courses/30/lessons/134240
public class Main2 {
	class Solution {
	    public static String solution(int[] food) {
	        String answer = "0";
	        for(int i=food.length-1; i>0; i--) for(int j=0; j<food[i]/2; j++) {
	        	answer = i + answer + i;
	        }
	        return answer;
	    }
	}
	public static void main(String[] args) {
		int[] food = {1, 3, 4, 6};
//		int[] food = {1, 7, 1, 2};
		System.out.println(Solution.solution(food));
	}
}
