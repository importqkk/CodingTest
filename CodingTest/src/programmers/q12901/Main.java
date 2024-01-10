package programmers.q12901;
import java.util.Calendar;

// Lv.1 2016년
// https://school.programmers.co.kr/learn/courses/30/lessons/12901
public class Main {
	class Solution {
	    public static String solution(int a, int b) {
	        Calendar c = Calendar.getInstance();
	        c.set(2016, a-1, b);
	        int day = c.get(Calendar.DAY_OF_WEEK);
	        switch(day) {
				case 1: return "SUN";
				case 2: return "MON";
				case 3: return "TUE";
				case 4: return "WED";
				case 5: return "THU";
				case 6: return "FRI";
				case 7: return "SAT";
			}
	        return "";
	    }
	}
	public static void main(String[] args) {
		int a = 5, b = 24;
		System.out.println(Solution.solution(a, b));
	}
}
