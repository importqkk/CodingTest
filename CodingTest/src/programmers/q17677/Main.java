package programmers.q17677;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Lv.2 [1차] 뉴스 클러스터링
// https://school.programmers.co.kr/learn/courses/30/lessons/17677
public class Main {
	class Solution {
	    public static int solution(String str1, String str2) {
	    	List<String> str1List = getList(str1);
	        List<String> str2List = getList(str2);
	        double inter = 0, union = 0, j = 0;
	        
	        for(String o: str1List) {
	        	if(str2List.remove(o)) inter++;
	        	union++;
	        }
	        for(@SuppressWarnings("unused") String t: str2List) union++;
	        
	        if(union == 0) j = 1;
	        else j =  inter /  union;
	        return (int) (j * 65536);
	    }
	}
	public static List<String> getList(String str) {
		List<String> list = new ArrayList<>();
		String s = ""; char c1, c2;
		str = str.toLowerCase();
		for(int i=0; i<str.length()-1; i++) {
			s = str.substring(i, i+2);
			c1 = s.charAt(0); c2 = s.charAt(1);
			if(c1 >= 'a' && c1 <= 'z' && c2 >= 'a' && c2 <= 'z') list.add(s);
		}
		Collections.sort(list);
		return list;
	}
	public static void main(String[] args) {
		String str1 = "handshake";
		String str2 = "shake hands";
		System.out.println(Solution.solution(str1, str2));
	}
}
