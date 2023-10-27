package programmers.q176963;
import java.util.*;

//Lv.1 추억 점수
//https://school.programmers.co.kr/learn/courses/30/lessons/176963
public class Main2 {
	class Solution {
	    public static int[] solution(String[] name, int[] yearning, String[][] photo) {
	    	int[] result = new int[photo.length];
			
			HashMap<String, Integer> map = new HashMap<>();
			for(int i=0; i<name.length; i++) map.put(name[i], yearning[i]);
			
			int point = 0;
			String person;
			for(int i=0; i<photo.length; i++) {
				point = 0;
				for(int j=0; j<photo[i].length; j++) {
					person = photo[i][j];
					if(map.containsKey(person)) point += map.get(person);
				}
				result[i] = point;
			}
			return result;
	    }
	}
	public static void main(String[] args) {
		String[] name = {"kali", "mari", "don"};
		int[] yearning = {11, 1, 55};
		String[][] photo = {{"kali", "mari", "don"}, {"pony", "tom", "teddy"}, {"con", "mona", "don"}};
		
		int[] result = Solution.solution(name, yearning, photo);
		
		for(int i=0; i<result.length; i++) {
			System.out.println(result[i]);
		}
	}
}
