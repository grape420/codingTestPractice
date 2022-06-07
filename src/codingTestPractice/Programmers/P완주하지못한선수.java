package codingTestPractice.Programmers;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class P완주하지못한선수 {

	/*
	 * 프로그래머스 완주하지 못한 선수
	 * 
	 * 문제 설명
		수많은 마라톤 선수들이 마라톤에 참여하였습니다. 단 한 명의 선수를 제외하고는 모든 선수가 마라톤을 완주하였습니다.
		
		마라톤에 참여한 선수들의 이름이 담긴 배열 participant와 완주한 선수들의 이름이 담긴 배열 completion이 주어질 때, 
		완주하지 못한 선수의 이름을 return 하도록 solution 함수를 작성해주세요.
		
		제한사항
		마라톤 경기에 참여한 선수의 수는 1명 이상 100,000명 이하입니다.
		completion의 길이는 participant의 길이보다 1 작습니다.
		참가자의 이름은 1개 이상 20개 이하의 알파벳 소문자로 이루어져 있습니다.
		참가자 중에는 동명이인이 있을 수 있습니다.
		입출력 예
		participant	            completion	           return
		["leo", "kiki", "eden"]	["eden", "kiki"]	"leo"
		["marina", "josipa", "nikola", "vinko", "filipa"]	["josipa", "filipa", "marina", "nikola"]	"vinko"
		["mislav", "stanko", "mislav", "ana"]	["stanko", "ana", "mislav"]	"mislav"
		입출력 예 설명
		예제 #1
		"leo"는 참여자 명단에는 있지만, 완주자 명단에는 없기 때문에 완주하지 못했습니다.
		
		예제 #2
		"vinko"는 참여자 명단에는 있지만, 완주자 명단에는 없기 때문에 완주하지 못했습니다.
		
		예제 #3
		"mislav"는 참여자 명단에는 두 명이 있지만, 완주자 명단에는 한 명밖에 없기 때문에 한명은 완주하지 못했습니다.
	 */
	
	public String solution(String[] participant, String[] completion) {
		String answer = "";
		
		// 1. HashMap을 만든다. (participant)
		Map<String, Integer> map = new HashMap<>();
		
		/* participant의 length만큼 반복하면서 map에다가 담음 */
		for (String player : participant) {
			/*
			 * key에는 player를 담고
			 * value에는 1를 담을 건데 ex) {"leo", 1}
			 * 동명이인이 있을 수 있으므로 getOrDefault() 메소드를 써서
			 * map에 player가 있으면 그 player의 value에 1을 더하고
			 * 없으면 0에다가 1을 더한다.
			 */
			map.put(player, map.getOrDefault(player, 0) + 1);
		}
		
		System.out.println(map);		// {leo=1, eden=1, kiki=1}
		
		// 2. HashMap을 뺀다. (completion)
		for (String player : completion) {
			/*
			 * 이번엔 completion의 length만큼 돌면서 map에 player를 넣을건데
			 * 기존 participant의 map에서 player의 value를 1를 빼준다.
			 */
			map.put(player, map.get(player) - 1);
		}
		
		System.out.println(map);		// {leo=1, eden=0, kiki=0}
		
		// 3. value가 0이 아닌 마지막 주자를 찾는다.
		// map.keySet() : map이 가지고 있는 key를 배열 형태로 반환 [leo, kiki, eden]
		for (String key : map.keySet()) {
			/*
			 * map에서 value가 0이 아닌 player를 찾는다. (완주하지 못한 선수)
			 * 찾으면 answer에 넣고 break로 나간다.
			 */
			if (map.get(key) != 0) {
				answer = key;
				break;
			}
		}
		
		// 3-1. EntrySet를 이용한 방법
		// iter.next() : ex) let = 1 (key와 value가 함께 나옴)
		Iterator<Map.Entry<String, Integer>> iter = map.entrySet().iterator();
		
		// 다음 값이 없을 때까지 반복
		while (iter.hasNext()) {
			Map.Entry<String, Integer> entry = iter.next();			// entry.getKey() : leo, kiki, eden | entry.getValue() : 1, 0, 0
			if (entry.getValue() != 0) {
				answer = entry.getKey();
				break;
			}
		}
		return answer;
	}
	
	public static void main(String[] args) {
		P완주하지못한선수 sol = new P완주하지못한선수();
		String[] participant = {"leo", "kiki", "eden"};
		String[] completion = {"eden", "kiki"};
		
		sol.solution(participant, completion);
	}
}
