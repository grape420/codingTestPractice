package codingTestPractice.day46;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Solution {
	
	/*
	 * 프로그래머스 위장
	 * 
	 * 문제 설명
		스파이들은 매일 다른 옷을 조합하여 입어 자신을 위장합니다.
		
		예를 들어 스파이가 가진 옷이 아래와 같고 오늘 스파이가 동그란 안경, 긴 코트, 파란색 티셔츠를 입었다면 
		다음날은 청바지를 추가로 입거나 동그란 안경 대신 검정 선글라스를 착용하거나 해야 합니다.
		
		종류	이름
		얼굴	동그란 안경, 검정 선글라스
		상의	파란색 티셔츠
		하의	청바지
		겉옷	긴 코트
		스파이가 가진 의상들이 담긴 2차원 배열 clothes가 주어질 때 서로 다른 옷의 조합의 수를 return 하도록 solution 함수를 작성해주세요.
		
		제한사항
		clothes의 각 행은 [의상의 이름, 의상의 종류]로 이루어져 있습니다.
		스파이가 가진 의상의 수는 1개 이상 30개 이하입니다.
		같은 이름을 가진 의상은 존재하지 않습니다.
		clothes의 모든 원소는 문자열로 이루어져 있습니다.
		모든 문자열의 길이는 1 이상 20 이하인 자연수이고 알파벳 소문자 또는 '_' 로만 이루어져 있습니다.
		스파이는 하루에 최소 한 개의 의상은 입습니다.
	 */
	
	public int solution(String[][] clothes) {
        
        // 1. 옷을 종류별로 구분한다.
        Map<String, Integer> map = new HashMap<>();
        
        for (String[] clothe : clothes) {
        	String type = clothe[1];		// type : "headgear", "eyewear", "headhear"
        	
        	/*
        	 * map에 key와 value를 담는다.
        	 * key는 옷의 종류를 담고
        	 * value에는 동일한 옷의 종류가 있으면 그 value에 1을 더하고
        	 * 없으면 0에다가 1을 더한다.
        	 */
        	map.put(type, map.getOrDefault(type, 0) + 1);
        }
        System.out.println(map);			// {eyewear = 1, headgear = 2}
        
        // 2. 입지 않는 경우를 추가해서 모든 조합을 계산한다.
        // map의 value들을 가지고 반복문을 돌린다.
        Iterator<Integer> iter = map.values().iterator();
        
        int answer = 1;
        while (iter.hasNext()) {
        	
        	/*
        	 * map의 value값을 뽑아 answer에 누적해서 곱한다.
        	 * 이 때 입지 않는 경우도 있으니 1을 더해서 곱한다.
        	 */
        	answer *= iter.next().intValue() + 1;
        }
        
        // 3. 아무 종류의 옷도 입지 않는 경우를 제외한다.
        return answer - 1;
    }
	
	public static void main(String[] args) {
		Solution sol = new Solution();
		String[][] clothes = { { "yellowhat", "headgear" }, 
							   { "bluesunglasses", "eyewear" }, 
							   { "green_turban", "headgear" } };
		
		System.out.println(sol.solution(clothes));
	}

}
