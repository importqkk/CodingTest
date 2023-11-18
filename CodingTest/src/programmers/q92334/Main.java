package programmers.q92334;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;

// Lv.1 신고 결과 받기
// https://school.programmers.co.kr/learn/courses/30/lessons/92334
public class Main {
	class Solution {
	    public static int[] solution(String[] id_list, String[] report, int k) {
	        int[] answer = new int[id_list.length];
	        Set<String> set = new HashSet<>();
	        StringTokenizer st;
	        StringBuilder sb;
	        String userId, reportId;
	        Map<String, Integer> reportCnt = new HashMap<>();
	        Map<String, String> reportHist = new HashMap<>();
	        List<String> ban = new ArrayList<>();
	        List<String> idList = Arrays.asList(id_list);
	        int idx = 0;
	        for(int i=0; i<report.length; i++) {
	        	if(set.contains(report[i])) continue;
	        	set.add(report[i]);
	        	st = new StringTokenizer(report[i], " ");
	        	userId = st.nextToken(); reportId = st.nextToken();
	        	reportCnt.put(reportId, reportCnt.getOrDefault(reportId, 0) + 1);
	        	if(reportCnt.get(reportId) == k) ban.add(reportId);
	        	if(reportHist.containsKey(reportId)) {
	        		sb = new StringBuilder();
	        		reportHist.put(reportId, sb.append(reportHist.get(reportId)).append(" ").append(userId).toString());
	        	} else reportHist.put(reportId, userId);
	        }
	        for(int i=0; i<ban.size(); i++) {
	        	st = new StringTokenizer(reportHist.get(ban.get(i)), " ");
	        	while(st.hasMoreTokens()) {
	        		userId = st.nextToken();
	        		idx = idList.indexOf(userId);
	        		answer[idx]++;
	        	}
	        }
	        return answer;
	    }
	}
	public static void main(String[] args) {
		String[] idList = {"con", "ryan"};
		String[] report = {"ryan con", "ryan con", "ryan con", "ryan con"};
		int k = 3;
		int[] result = Solution.solution(idList, report, k);
		for(int r: result) System.out.println(r);
	}
}
