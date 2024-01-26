package programmers.q12981;
import java.util.ArrayList;
import java.util.List;

// Lv.2 영어 끝말잇기
// https://school.programmers.co.kr/learn/courses/30/lessons/12981
public class Main {
	class Solution {
	    public static int[] solution(int n, String[] words) {
	        List<String> list = new ArrayList<>();
	        char last = words[0].charAt(0);
	        int player = 0, turn = 0;
	        for(int i=0; i<words.length; i++) {
	        	if(list.contains(words[i]) || words[i].charAt(0) != last) {
	        		player = (i + 1) % n == 0 ? n : (i + 1) % n;
	        		turn = (i + 1) % n == 0 ? (i + 1) / n : (i + 1) / n + 1;
	        		break;
	        	}
	        	last = words[i].charAt(words[i].length()-1);
	        	list.add(words[i]);
	        }
	        return new int[] {player, turn};
	    }
	}
	public static void main(String[] args) {
		int n = 2;
		String[] words = {"hello", "one", "even", "never", "now", "world", "draw"};
		int[] result = Solution.solution(n, words);
		for(int r: result) System.out.println(r);
	}
}
