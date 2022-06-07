package codingTestPractice.Programmers;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class P완주하지못한선수3 {
	
	/*
	 * 완주하지 못한 선수
	 * 
	 * 수많은 마라톤 선수들이 마라톤에 참여하였습니다. 단 한 명의 선수를 제외하고는 모든 선수가 마라톤을 완주하였습니다.

		마라톤에 참여한 선수들의 이름이 담긴 배열 participant와 완주한 선수들의 이름이 담긴 배열 completion이 주어질 때, 
		완주하지 못한 선수의 이름을 return 하도록 solution 함수를 작성해주세요.
		
		제한사항
		마라톤 경기에 참여한 선수의 수는 1명 이상 100,000명 이하입니다.
		completion의 길이는 participant의 길이보다 1 작습니다.
		참가자의 이름은 1개 이상 20개 이하의 알파벳 소문자로 이루어져 있습니다.
		참가자 중에는 동명이인이 있을 수 있습니다.
	 */
	
	public String solution(String[] participant, String[] completion) {
		String answer = "";
		
		// 1. HashMap을 만든다. (participant)
		Map<String, Integer> map = new HashMap<String, Integer>();
		for (String player : participant) {
			map.put(player, map.getOrDefault(player, 0) + 1);
		}
		
		// 2. HashMap을 뺀다. (completion)
		for (String player : completion) {
			map.put(player, map.get(player) - 1);
		}

//		System.out.println("keySet : " + map.keySet());
		// 3. value가 0이 아닌 마지막 주자를 찾는다.
		for(String key : map.keySet()) {
			if(map.get(key) != 0) {
				answer = key;
				break;
			}
		}
		
//		Iterator<Map.Entry<String, Integer>> iter = map.entrySet().iterator();
//		while(iter.hasNext()) {
//			Map.Entry<String, Integer> entry = iter.next();
//			if (entry.getValue() != 0) {
//				answer = entry.getKey();
//				break;
//			}
//		}
		
		return answer;
	}
	
	
	public static void main(String[] args) {
		String[] part = {"marina", "josipa", "nikola", "vinko", "filipa"};
		String[] comp = {"josipa", "filipa", "marina", "nikola"};
		P완주하지못한선수3 sol = new P완주하지못한선수3();
		System.out.println(sol.solution(part, comp));
	}

}
