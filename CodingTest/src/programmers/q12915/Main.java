package programmers.q12915;
import java.util.Arrays;
import java.util.Comparator;

// Lv.1 문자열 내 마음대로 정렬하기
// https://school.programmers.co.kr/learn/courses/30/lessons/12915
public class Main {
	class Solution {
	    public static String[] solution(String[] strings, int n) {
	    	Arrays.sort(strings);
	    	Arrays.sort(strings, new Comparator<String>() {
				@Override
				public int compare(String o1, String o2) {
					if(o1.charAt(n) > o2.charAt(n)) return 1;
					else if(o1.charAt(n) < o2.charAt(n)) return -1;
					return 0;
				}
			});
	    	return strings;
	    }
	}
	public static void main(String[] args) {
		String[] strings = {"abce", "abcd", "cdx"};
		int n = 2;
		String[] result = Solution.solution(strings, n);
		for(String r: result) System.out.println(r);
	}
}
