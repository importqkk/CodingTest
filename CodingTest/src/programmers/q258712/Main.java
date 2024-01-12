package programmers.q258712;
import java.util.HashMap;
import java.util.Map;

// Lv.1 가장 많이 받은 선물
// https://school.programmers.co.kr/learn/courses/30/lessons/258712
public class Main {
	class Solution {
	    public static int solution(String[] friends, String[] gifts) {
	    	int answer = 0, cnt1 = 0, cnt2 = 0;
	    	String user1 = "", user2 = "", grStr = "", grStrRev = "";
	    	String[] users = new String[2];
	        Map<String, Integer> ex = new HashMap<>();
	        Map<String, Integer> user = new HashMap<>();
	        Map<String, Integer> gr = new HashMap<>();
	        for(String gift : gifts) {
	            gr.put(gift, gr.getOrDefault(gift, 0) + 1);
	            users = gift.split(" ");
	            ex.put(users[0], ex.getOrDefault(users[0], 0) + 1);
	            ex.put(users[1], ex.getOrDefault(users[1], 0) - 1);
	        }
	        for(int i = 0; i < friends.length; i++) for (int j = i + 1; j < friends.length; j++) {
                user1 = friends[i];
                user2 = friends[j];
                grStr = user1 + " " + user2;
                grStrRev = user2 + " " + user1;
                cnt1 = gr.getOrDefault(grStr, 0);
                cnt2 = gr.getOrDefault(grStrRev, 0);
                if(cnt1 > cnt2) user.put(user1, user.getOrDefault(user1, 0) + 1);
                else if(cnt1 < cnt2) user.put(user2, user.getOrDefault(user2, 0) + 1);
                else {
                    if(ex.getOrDefault(user1, 0) > ex.getOrDefault(user2, 0)) user.put(user1, user.getOrDefault(user1, 0) + 1);
                    else if(ex.getOrDefault(user1, 0) < ex.getOrDefault(user2, 0)) user.put(user2, user.getOrDefault(user2, 0) + 1);
                }
	        }
	        for(String key: user.keySet()) if(user.getOrDefault(key, 0) > answer) answer = user.getOrDefault(key, 0);
	        return answer;
	    }
	}
	public static void main(String[] args) {
		String[] friends = {"joy", "brad", "alessandro", "conan", "david"};
		String[] gifts = {"alessandro brad", "alessandro joy", "alessandro conan", "david alessandro", "alessandro david"};
		System.out.println(Solution.solution(friends, gifts));
	}
}
