package programmers.q82612;

// Lv.1 부족한 금액 계산하기
// https://school.programmers.co.kr/learn/courses/30/lessons/82612
public class Main {
	class Solution {
	    public static long solution(int price, int money, int count) {
	    	long answer = 0;
	    	for(int i=1; i<=count; i++) answer += price * i;
	        return answer <= money ? 0 : answer - money;
	    }
	}
	public static void main(String[] args) {
		int price = 3;
		int money = 20;
		int count = 4;
		System.out.println(Solution.solution(price, money, count));
	}
}
