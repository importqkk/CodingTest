package programmers.q176963;

// Lv.1 추억 점수
// https://school.programmers.co.kr/learn/courses/30/lessons/176963
public class Main {
	class Solution {
	    public static int[] solution(String[] name, int[] yearning, String[][] photo) {
			int[] result = new int[photo.length];
			
			int point = 0;
			for(int i=0; i<photo.length; i++) {
				point = 0;
				for(int j=0; j<photo[i].length; j++) {
					for(int k=0; k<name.length; k++) {
						if(photo[i][j].equals(name[k])) point += yearning[k];
					}
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
