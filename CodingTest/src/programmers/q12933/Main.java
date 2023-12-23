package programmers.q12933;

// 정수 내림차순으로 배치하기
// https://school.programmers.co.kr/learn/courses/30/lessons/12933
public class Main {
	class Solution {
	    public static long solution(long n) {
	    	String str = Long.toString(n);
	    	int[] arr = new int[str.length()];
	    	int tmp = 0;
	    	StringBuilder answer = new StringBuilder();
	    	for(int i=0; i<str.length(); i++) arr[i] = Integer.parseInt(String.valueOf(str.charAt(i)));
	    	for(int i=0; i<arr.length-1; i++) for(int j=0; j<arr.length-1; j++) if(arr[j] < arr[j+1]) {
				tmp = arr[j];
				arr[j] = arr[j+1];
				arr[j+1] = tmp;
	    	}
	    	for(int i=0; i<arr.length; i++) answer.append(arr[i]);
	    	return Long.parseLong(answer.toString());
	    }
	}
	public static void main(String[] args) {
		long n = 118372;
		System.out.println(Solution.solution(n));
	}
}
