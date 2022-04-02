package codingTestPractice.day19;

import java.util.Arrays;

public class Solution2 {

	/*
	 * 문자열 내림차순으로 배치하기
	 * 
	 * 문자열 s에 나타나는 문자를 큰것부터 작은 순으로 정렬해 새로운 문자열을 리턴하는 함수, solution을 완성해주세요.
	   s는 영문 대소문자로만 구성되어 있으며, 대문자는 소문자보다 작은 것으로 간주합니다.
	   
	   제한 사항
	   str은 길이 1 이상인 문자열입니다.
	   
	   입출력 예
	   s	        return
	   "Zbcdefg"	"gfedcbZ"
	 */
	
	public String solution(String s) {
        String answer = "";
//        char[] cArr = new char[s.length()];
//        
//        for (int i = 0; i < s.length(); i++) {
//        	cArr[i] = s.charAt(i);
//        }
//        for (int i = 0; i < cArr.length; i++) {
//        	for (int j = i; j < cArr.length; j++) {
//        		if (cArr[i] < cArr[j]) {
//        			char temp = 0;
//        			temp = cArr[i];
//        			cArr[i] = cArr[j];
//        			cArr[j] = temp;
//        		}
//        	}
//        	answer += cArr[i];
//        }
        
        char[] cArr = s.toCharArray();
        Arrays.sort(cArr);
        StringBuilder sb = new StringBuilder(String.valueOf(cArr));
        sb.reverse();
        answer = sb.toString();
        
        return answer;
    }
	
	public static void main(String[] args) {
		Solution2 sol = new Solution2();
		String s = "Zbcdefg";
		
		sol.solution(s);
	}
}
