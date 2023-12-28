package programmers.q12926;

// Lv.1 시저 암호
// https://school.programmers.co.kr/learn/courses/30/lessons/12926
public class Main {
	class Solution {
	    public static String solution(String s, int n) {
	        char[] arr = s.toCharArray();
	        char c;
	        for(int i=0; i<arr.length; i++) {
	        	if(arr[i] == ' ') continue;
	        	c = (char) (arr[i] + n);
	        	if ((arr[i] >= 'A' && arr[i] <= 'Z' && c > 'Z') || (arr[i] >= 'a' && arr[i] <= 'z' && c > 'z')) c -= 26;
	        	arr[i] = c;
	        }
	        return String.valueOf(arr);
	    }
	}
	public static void main(String[] args) {
		String s = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		int n = 1;
		System.out.println(Solution.solution(s, n));
	}
}
