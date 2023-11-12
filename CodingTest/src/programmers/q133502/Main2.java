package programmers.q133502;

// Lv.1 햄버거 만들기
// https://school.programmers.co.kr/learn/courses/30/lessons/133502
public class Main2 {
	class Solution {
	    public static int solution(int[] ingredient) {
	    	int[] arr = new int[ingredient.length];
	        int answer=0, idx=0;
	        for(int i=0; i<ingredient.length; i++) {
	        	arr[idx++] = ingredient[i];
	        	if(idx>=4&&arr[idx-1]==1&&arr[idx-2]==3&&arr[idx-3]==2&&arr[idx-4]==1) {
	        		idx -= 4;
	        		answer++;
	        	}
	        }
	        return answer;
	    }
	}
	public static void main(String[] args) {
		int[] ingredient = {1, 3, 2, 1, 2, 1, 3, 1, 2};
		System.out.println(Solution.solution(ingredient));
	}
}
