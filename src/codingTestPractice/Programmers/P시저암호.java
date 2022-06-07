package codingTestPractice.Programmers;

public class P시저암호 {
	
	/*
	 * 시저 암호
	 * 
	 * 어떤 문장의 각 알파벳을 일정한 거리만큼 밀어서 다른 알파벳으로 바꾸는 암호화 방식을 시저 암호라고 합니다. 
	 * 예를 들어 "AB"는 1만큼 밀면 "BC"가 되고, 3만큼 밀면 "DE"가 됩니다. "z"는 1만큼 밀면 "a"가 됩니다. 
	 * 문자열 s와 거리 n을 입력받아 s를 n만큼 민 암호문을 만드는 함수, solution을 완성해 보세요.
	 * 
	 * 제한 조건
	 * 공백은 아무리 밀어도 공백입니다.
	   s는 알파벳 소문자, 대문자, 공백으로만 이루어져 있습니다.
	   s의 길이는 8000이하입니다.
	   n은 1 이상, 25이하인 자연수입니다.
	 */
	
	public String solution(String s, int n) {
        String answer = "";
        int mod = n % 26;			// n이 26을 넘어갈 경우 26으로 나누어 나머지를 구한다.
        
        for (int i = 0; i < s.length(); i++) {
        	char temp = s.charAt(i);
        	
        	if (temp != ' ') {								 // 값이 비어있지 않을 경우
        		if (temp >= 'a' && temp <= 'z') {			 // 소문자인 경우
        			if (temp + mod > 'z') {					 // 더했을 때 소문자 z를 넘어가는 경우
    					answer += (char)(temp + mod - 26);			 // 26을 뺌(알파벳은 26글자 이기 때문)
    				} else {
    					answer += (char)(temp + mod);				 // 더한 값을 String 문자열에 담음 
    				}
        		} else {									 // 대문자인 경우
        			if(temp + mod > 'Z') {					 // 더했을 때 대문자 Z를 넘어가는 경우
        				answer += (char)(temp + mod - 26);			 // 26을 뺌(알파벳은 26글자 이기 때문)
        			} else {
        				answer += (char)(temp + mod);
        			}
        		}
        	} else {										// 값이 비어있을 경우 비어있는 값 리턴
				answer += temp;
			}
        }
        
        return answer;
    }
	
	public static void main(String[] args) {
		P시저암호 sol = new P시저암호();
		String s = "AB";
		int n = 1;
		
		sol.solution(s, n);
	}

}
