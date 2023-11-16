package programmers.q131128;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

// Lv.1 숫자 짝꿍
// https://school.programmers.co.kr/learn/courses/30/lessons/131128
// 시간 초과
public class Main {
	class Solution {
	    public static String solution(String X, String Y) {
	    	StringBuilder answer = new StringBuilder();
	    	char[] x = X.toCharArray(), y = Y.toCharArray();
	    	int idx = 0;
	    	Arrays.sort(x);
	    	Arrays.sort(y);
	    	List<Character> list = new ArrayList<>();
	    	for(int i=0; i<x.length; i++) for(int j=idx; j<y.length; j++) {
	    		if(x[i] == y[j]) {
	    			list.add(x[i]);
	    			idx = j+1;
	    			break;
	    		}
	    	}
	    	if(list.isEmpty()) return "-1";
	    	else if(list.size() == 1) return list.get(0).toString();
    		Collections.sort(list, Collections.reverseOrder());
    		answer.append(list.get(0));
    		for(int i=1; i<list.size(); i++) {
    			if(list.get(0) == '0' && list.get(i) == '0') continue;
	    		answer.append(list.get(i));
    		}
	    	return answer.toString();
	    }
	}
	public static void main(String[] args) {
		String x = "100", y = "203045";
		System.out.println(Solution.solution(x, y));
	}
}
