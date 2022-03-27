package codingTestPractice.day14;

import java.util.Arrays;

public class Solution {
	
	/*
	 * 이상한 문자 만들기
	 * 
	 * 문자열 s는 한 개 이상의 단어로 구성되어 있습니다. 
	 * 각 단어는 하나 이상의 공백문자로 구분되어 있습니다. 
	 * 각 단어의 짝수번째 알파벳은 대문자로, 홀수번째 알파벳은 소문자로 바꾼 문자열을 리턴하는 함수, solution을 완성하세요.
	 * 
	 * 제한 사항
	 * 문자열 전체의 짝/홀수 인덱스가 아니라, 단어(공백을 기준)별로 짝/홀수 인덱스를 판단해야합니다.
	   첫 번째 글자는 0번째 인덱스로 보아 짝수번째 알파벳으로 처리해야 합니다.
	 */
	
	public String solution(String s) {
        String answer = "";				// 반환할 문자열
        String[] str = s.split("");		// 전달받은 문자열을 잘라서 배열에 담음
        int index = 0;					// 짝수번째를 구분할 index 선언
        
        for (int i = 0; i < str.length; i++) {
        	if (str[i].equals(" ")) {				// 문자열 중 공백이 있다면 index 0으로 초기화
        		index = 0;
        	} else if (index % 2 == 0) {			// index가 짝수라면 문자열 대문자로 바꾸고 index 증가 시켜 홀수로 만듦
        		str[i] = str[i].toUpperCase();
        		index++;
        	} else if (index % 2 != 0) {			// index가 홀수라면 문자열 소문자로 바꾸고 index 증가 시켜 짝수로 만듦
        		str[i] = str[i].toLowerCase();
        		index++;
        	}
        	answer += str[i];			// 대소문자 바꾼 배열을 문자열로 합침
        }
        return answer;
    }
	
	public static void main(String[] args) {
		Solution sol = new Solution();
		String s = "try hello worlds";
		
		sol.solution(s);
	}

}
