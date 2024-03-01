package programmers.q42577;
import java.util.Arrays;

// Lv.2 전화번호 목록
// https://school.programmers.co.kr/learn/courses/30/lessons/42577
public class Main {
	class Solution {
	    public static boolean solution(String[] phone_book) {
	        Arrays.sort(phone_book);
	        for(int i=0; i<phone_book.length-1; i++) if(phone_book[i+1].startsWith(phone_book[i])) return false;
	        return true;
	    }
	}
	public static void main(String[] args) {
		String[] phoneBook = {"12","123","1235","567","88"};
		System.out.println(Solution.solution(phoneBook));
	}
}
