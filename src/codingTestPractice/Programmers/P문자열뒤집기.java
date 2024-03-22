package codingTestPractice.Programmers;

public class P문자열뒤집기 {

	public static void main(String[] args) {
		/*
		 *  문제 설명
			문자열 my_string이 매개변수로 주어집니다. my_string을 거꾸로 뒤집은 문자열을 return하도록 solution 함수를 완성해주세요.
			
			제한사항
			1 ≤ my_string의 길이 ≤ 1,000
			입출력 예
			my_string	return
			"jaron"	"noraj"
			"bread"	"daerb"
		 */
		
		String my_string = "bread";
		
		solution(my_string);

	}

	private static String solution(String my_string) {
		String answer = "";
		
		for (int i = 0; i < my_string.length(); i++) {
			answer += my_string.charAt(my_string.length() - 1 - i);
		}
		System.out.println(answer);
		
		return answer;
		
	}

}
