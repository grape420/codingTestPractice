package codingTestPractice.day8;

import java.util.Arrays;

public class Solution3 {
	
	/*
	 * 핸드폰 번호 가리기
	 * 
	 * 프로그래머스 모바일은 개인정보 보호를 위해 고지서를 보낼 때 고객들의 전화번호의 일부를 가립니다.
       전화번호가 문자열 phone_number로 주어졌을 때, 전화번호의 뒷 4자리를 제외한 나머지 숫자를 
       전부 *으로 가린 문자열을 리턴하는 함수, solution을 완성해주세요.
       
       제한 조건 
       s는 길이 4이상, 20이하인 문자열입니다.
	 */
	
	public String solution(String phone_number) {
        String answer = "";
       
        // 1. char[]을 이용한 풀이
//       char[] charArr = phone_number.toCharArray();
//       
//       for (int i = 0; i < charArr.length - 4; i++) {
//    	   charArr[i] = '*';
//       }
//       
//       answer = String.valueOf(charArr);
        
        // 2. substring을 이용한 풀이
        for (int i = 0; i < phone_number.length() - 4; i++) {
        	answer += "*";
        }
        System.out.println(answer);
        
        answer += phone_number.substring(phone_number.length() - 4);
        
        System.out.println(answer);
        
        return answer;
    }
	
	public static void main(String[] args) {
		Solution3 sol = new Solution3();
		String pNum = "01089057678";
		
		sol.solution(pNum);
	}

}
