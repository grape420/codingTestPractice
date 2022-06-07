package codingTestPractice.Programmers;

public class P문자열다루기기본 {
	
	/*
	 * 문자열 다루기 기본
	 * 
	 * 문자열 s의 길이가 4 혹은 6이고, 숫자로만 구성돼있는지 확인해주는 함수, solution을 완성하세요. 
	 * 예를 들어 s가 "a234"이면 False를 리턴하고 "1234"라면 True를 리턴하면 됩니다.
	 * 
	 * 제한 사항
	 * s는 길이 1 이상, 길이 8 이하인 문자열입니다.
	 * 
	 * 입출력 예
	 * s	return
	  "a234"	false
	  "1234"	true
	 */
	
	public boolean solution(String s) {
        boolean answer = false;
        int cnt = 0;
        
        // 1. 문자열 s의 길이가 4 혹은 6
        if (s.length() == 4 || s.length() == 6) {
        	// 2. 문자열 s가 숫자로만 이루어졌는지
        	for (int i = 0; i < s.length(); i++) {
        		if(Character.isDigit(s.charAt(i))) cnt++;
        	}
        	if (s.length() == cnt) answer = true;
        } else {
        	answer = false;
        }
        
        // 3. 문자열 s는 4글자 숫자 또는 6글자 숫자만 true이다. 
        return answer;
    }
	
	public static void main(String[] args) {
		P문자열다루기기본 sol = new P문자열다루기기본();
		String s = "1234^6";
		
		sol.solution(s);
	}
	
	

}
