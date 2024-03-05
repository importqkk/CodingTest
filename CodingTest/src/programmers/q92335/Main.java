package programmers.q92335;

// Lv.2 k진수에서 소수 개수 구하기
// https://school.programmers.co.kr/learn/courses/30/lessons/92335
public class Main {
	class Solution {
	    public static int solution(int n, int k) {
	        int answer = 0;
	        long prime = 0;
	        String num = Integer.toString(n, k);
	        String[] arr = num.split("0");
	        for(String a: arr) {
	        	if(a.length() <= 0) continue;
	        	prime = Long.parseLong(a);
	        	if(prime != 1 && isPrime(prime)) answer++;
	        }
	        return answer;
	    }
	}
	public static boolean isPrime(long prime) {
    	for(long i=2; i<=Math.sqrt(prime); i++) if(prime % i == 0) return false;
    	return true;
	}
	public static void main(String[] args) {
		int n = 110011;
		int k = 10;
		System.out.println(Solution.solution(n, k));
	}
}
