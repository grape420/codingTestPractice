package codingTestPractice.Programmers;

public class P숫자문자열과영단어 {
	
	/*
	 * 숫자 문자열과 영단어
	 * 
	 * 다음은 숫자의 일부 자릿수를 영단어로 바꾸는 예시입니다.

		1478 → "one4seveneight"
		234567 → "23four5six7"
		10203 → "1zerotwozero3"
		이렇게 숫자의 일부 자릿수가 영단어로 바뀌어졌거나, 혹은 바뀌지 않고 그대로인 문자열 s가 매개변수로 주어집니다. 
		s가 의미하는 원래 숫자를 return 하도록 solution 함수를 완성해주세요.
		
		참고로 각 숫자에 대응되는 영단어는 다음 표와 같습니다.
		숫자	영단어
		0	zero
		1	one
		2	two
		3	three
		4	four
		5	five
		6	six
		7	seven
		8	eight
		9	nine
		
		제한사항
		1 ≤ s의 길이 ≤ 50
		s가 "zero" 또는 "0"으로 시작하는 경우는 주어지지 않습니다.
		return 값이 1 이상 2,000,000,000 이하의 정수가 되는 올바른 입력만 s로 주어집니다.
		
		입출력 예
		s	                result
		"one4seveneight"	1478
		"23four5six7"	    234567
		"2three45sixseven"	234567
		"123"	            123
	 */
	
	public int solution(String s) {
		int answer = 0;
		String[] num = {"0","1","2","3","4","5","6","7","8","9"};
	    String[] word = {"zero" , "one" , "two" , "three" , "four" , "five" , "six" , "seven" , "eight" , "nine"};
		
	    for (int i = 0; i < num.length; i++) {
	    	s = s.replace(word[i], num[i]);
	    }
	    answer = Integer.valueOf(s);
		return answer;
	}
	
	public static void main(String[] args) {
		P숫자문자열과영단어 sol = new P숫자문자열과영단어();
		String s = "one4seveneight";
		
		sol.solution(s);
	}

}
