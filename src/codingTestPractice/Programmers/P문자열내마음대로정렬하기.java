package codingTestPractice.Programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class P문자열내마음대로정렬하기 {
	
	/*
	 * 문자열 내 마음대로 정렬하기
	 * 
	 * 문자열로 구성된 리스트 strings와, 정수 n이 주어졌을 때, 각 문자열의 인덱스 n번째 글자를 기준으로 오름차순 정렬하려 합니다. 
	 * 예를 들어 strings가 ["sun", "bed", "car"]이고 n이 1이면 각 단어의 인덱스 1의 문자 "u", "e", "a"로 strings를 정렬합니다.
	 * 
	 * 제한 조건
	 * strings는 길이 1 이상, 50이하인 배열입니다.
	   strings의 원소는 소문자 알파벳으로 이루어져 있습니다.
	   strings의 원소는 길이 1 이상, 100이하인 문자열입니다.
	   모든 strings의 원소의 길이는 n보다 큽니다.
	   인덱스 1의 문자가 같은 문자열이 여럿 일 경우, 사전순으로 앞선 문자열이 앞쪽에 위치합니다.
	 */
	
	public String[] solution(String[] strings, int n) {
		String[] answer = {};
		List<String> list = new ArrayList<String>();			// strings 문자열을 담을 ArrayList 생성
		
		for (int i = 0; i < strings.length; i++) {
			list.add(strings[i].charAt(n) + strings[i]);		// ArrayList에 인덱스 n번째 글자를 앞에 붙여 strings 문자열을 담는다. 
		}
		Collections.sort(list);									// 정렬 (n번째 글자가 동일해도 뒤에 문자는 사전순으로 정렬된다.)
		
		answer = new String[list.size()];
		
		for (int i = 0; i < list.size(); i++) {					// ArraysList에 문자열들을 다시 String 배열에 옮겨 담는 작업
			answer[i] = list.get(i).substring(1, list.get(i).length());		// 옮겨 담을 때 처음 붙인 인덱스 n번째 글자를 자르고 담는다.
		}
		
		return answer;
    }
	
	public static void main(String[] args) {
		P문자열내마음대로정렬하기 sol = new P문자열내마음대로정렬하기();
		String[] strings = { "abce", "abcd", "cdx" };
		int n = 2;
		
		sol.solution(strings, n);
	}

}
