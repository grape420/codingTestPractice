package codingTestPractice.Programmers;

import java.util.Arrays;

public class PA로B만들기 {

	public static void main(String[] args) {

		/*
		 *  문제 설명
			문자열 before와 after가 매개변수로 주어질 때, before의 순서를 바꾸어 after를 만들 수 있으면 1을, 만들 수 없으면 0을 return 하도록 solution 함수를 완성해보세요.
			
			제한사항
			0 < before의 길이 == after의 길이 < 1,000
			before와 after는 모두 소문자로 이루어져 있습니다.
			입출력 예
			before		after		result
			"olleh"		"hello"		1
			"allpe"		"apple"		0
		 */
		
		String before = "allpe";
		String after = "apple";
		
		solution(before, after);
	}

	public static int solution(String before, String after) {
		int answer = 0;
		
		char[] beforeArr = before.toCharArray();
		char[] afterArr = after.toCharArray();
		
		Arrays.sort(beforeArr);
		Arrays.sort(afterArr);
		
		before = Arrays.toString(beforeArr);
		after = Arrays.toString(afterArr);
		
		answer = before.equals(after) ? 1 : 0;
		return answer;
	}
	

}
