package programmers.q178871;
import java.util.*;

// Lv.1 달리기 경주
// https://school.programmers.co.kr/learn/courses/30/lessons/178871
public class Main {
	public static void main(String[] args) {
		
		String[] players = {"mumu", "soe", "poe", "kai", "mine"};
		String[] callings = {"kai", "kai", "mine", "mine"};
		
		int cnt = players.length;
		
		HashMap<String, Integer> map = new HashMap<>();
		for(int i=0; i<cnt; i++) map.put(players[i], i);
		
		int call;
		String front;
		for(int i=0; i<callings.length; i++) {
			call = map.get(callings[i]);
			front = players[call-1];
			map.put(front, call);
			players[call] = front;
			map.put(callings[i], call-1);
			players[call-1] = callings[i];
		}
		
		// 확인
//		for(int i=0; i<cnt; i++) {			
//			System.out.println(players[i]);
//		}
		
		// 제출
//		return players;
		
	}
}
