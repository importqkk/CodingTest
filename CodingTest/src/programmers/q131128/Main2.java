package programmers.q131128;

// Lv.1 숫자 짝꿍
// https://school.programmers.co.kr/learn/courses/30/lessons/131128
public class Main2 {
	class Solution {
	    public static String solution(String X, String Y) {
	    	StringBuilder answer = new StringBuilder();
	    	int[] xArr = new int[10], yArr = new int[10];
	    	makeArr(X, xArr);
	    	makeArr(Y, yArr);
	    	for(int i=xArr.length-1; i>=0; i--) while(xArr[i] > 0 && yArr[i] > 0) {
	    		xArr[i]--;
	    		yArr[i]--;
	    		answer.append(i);
	    	}
	    	if(answer.toString().equals("")) return "-1";
	    	else if(answer.toString().startsWith("0")) return "0";
	    	else return answer.toString();
	    }
	    private static void makeArr(String str, int[] arr) {
	    	int idx = 0;
	    	for(int i=0; i<str.length(); i++) {
	    		idx = str.charAt(i) - '0';
	    		arr[idx]++;
	    	}
	    }
	}
	public static void main(String[] args) {
		String x = "5525", y = "1255";
		System.out.println(Solution.solution(x, y));
	}
}
