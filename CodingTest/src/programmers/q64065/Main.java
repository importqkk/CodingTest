package programmers.q64065;
import java.util.LinkedHashSet;
import java.util.Set;

// Lv.2 튜플
// https://school.programmers.co.kr/learn/courses/30/lessons/64065
public class Main {
	class Solution {
	    public static int[] solution(String s) {
	        Set<Integer> set = new LinkedHashSet<>();
	        String[] arr = s.split("\\},\\{");
	        arr[0] = arr[0].replaceAll("[{}]", "");
	        arr[arr.length-1] = arr[arr.length-1].replaceAll("[{}]", "");
	        String[][] str = new String[arr.length][];
	        String[] ss;
	        for(String a: arr) {
	        	ss = a.split(",");
	        	str[ss.length-1] = ss;
	        }
	        for(int i=0; i<str.length; i++) {
	        	for(int j=0; j<str[i].length; j++) {
	        		set.add(Integer.parseInt(str[i][j]));
	        	}
	        }
	        return set.stream().mapToInt(i -> i).toArray();
	    }
	}
	public static void main(String[] args) {
		String s = "{{2},{2,1},{2,1,3},{2,1,3,4}}";
		int[] arr = Solution.solution(s);
		for(int a: arr) System.out.println(a);
	}
}
