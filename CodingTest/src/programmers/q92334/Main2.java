package programmers.q92334;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

// Lv.1 신고 결과 받기
// https://school.programmers.co.kr/learn/courses/30/lessons/92334
public class Main2 {
	class Solution {
	    public static int[] solution(String[] id_list, String[] report, int k) {
	    	// report 배열에서 중복값 제거하여 reportList 생성
	    	// -> "한 유저를 여러 번 신고할 수도 있지만, 동일한 유저에 대한 신고 횟수는 1회로 처리됩니다."
	        List<String> reportList = Arrays.stream(report).distinct().collect(Collectors.toList());
	        // 신고당한 횟수 기록하는 맵 (신고당한 id, 신고당한 횟수)
	        HashMap<String, Integer> reportCnt = new HashMap<>();
	        String reportId;
	        for(String r: reportList) {
	        	reportId = r.split(" ")[1];
	        	reportCnt.put(reportId, reportCnt.getOrDefault(reportId, 0) + 1);
	        }
	        // Arrays.stream(id_list) -> 사용자 목록을 스트림으로 변환
	        // _user -> id_list를 통해 성성된 스트림의 각각의 사용자
	        return Arrays.stream(id_list).map(_user -> {
	        	// _user를 final로 선언 -> 람다 표현식 내에서 외부의 변수(id_list)를 사용할 때 해당 변수가 람다 내에서 변경되지 않도록 하기 위함
		        // 	-> 람다 표현식에서 외부 변수를 사용할 때, 해당 변수는 사실상 final이어야 합니다.
		        // 	   이것은 람다 표현식이 외부 변수를 캡처할 때 해당 변수의 값을 복사하여 사용하는데, 
		        // 	   만약 변수가 재할당되는 경우 이를 정확하게 캡처하기 어려워집니다. 
		        //     따라서 람다 표현식에서 사용되는 외부 변수는 사실상 final로 간주되어야 합니다.
	        	final String user = _user;
	        	// reportList에서 user로 시작하는 값들을 필터링하여 list 생성
	        	//  -> String[] idList = {"muzi", "frodo", "apeach", "neo"};
	        	// 	   String[] report = {"muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"};
	        	// 	   일 때 muzi에 해당하는 리스트(muzi frodo, muzi neo)와
	        	// 	   frodo에 해당하는 리스트(frodo neo), 
	        	// 	   apeach에 해당하는 리스트(apeach frodo,apeach muzi)가 각각 개별의 리스트로 생성된다.
	        	List<String> list = reportList.stream().filter(s -> s.startsWith(user + " ")).collect(Collectors.toList());
	        	// "신고자ID 신고ID" 형식의 데이터가 들어있는 list에서 
	        	// 신고ID를 key로 갖는 reportCnt의 value값(신고ID가 신고당한 횟수)을 가져와서
	        	// k 이상인 경우를 카운트하면 신고자ID가 신고 결과 메일을 받는 횟수가 됨
	        	return list.stream().filter(s -> reportCnt.getOrDefault(s.split(" ")[1], 0) >= k).count();
	        	// count()는 반환 값으로 long을 제공하므로 int로 변환하고, toArray()로 배열로 변환
	        }).mapToInt(Long::intValue).toArray();
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
