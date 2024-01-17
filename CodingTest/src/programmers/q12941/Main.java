package programmers.q12941;
import java.util.Arrays;

// Lv.2 최솟값 만들기
// https://school.programmers.co.kr/learn/courses/30/lessons/12941
public class Main {
	class Solution {
	    public static int solution(int[] A, int[] B) {
	        int answer = 0, tmp = 0;
	        Arrays.sort(A); Arrays.sort(B);
	        for(int i=0; i<B.length/2; i++) {
	        	tmp = B[i];
	        	B[i] = B[B.length - 1 - i];
	        	B[B.length - 1 -i] = tmp;
	        }
	        for(int i=0; i<A.length; i++) answer += (A[i] * B[i]);
	        return answer;
	    }
	}
	public static void main(String[] args) {
		int[] a = {3,4};
		int[] b = {1,2};
		System.out.println(Solution.solution(a, b));
	}
}
