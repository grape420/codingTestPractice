package codingTestPractice.Programmers;

public class P짝수와홀수 {

	/*
	 * 짝수와 홀수
	 * 
	 * 정수 num이 짝수일 경우 "Even"을 반환하고 홀수인 경우 "Odd"를 반환하는 함수, solution을 완성해주세요.
	 * 
	 * 
	 */

	public String solution(int num) {
		if (num % 2 == 0) {
			return ("Even");
		} else
			return ("Odd");
	}

	public static void main(String[] args) {
		P짝수와홀수 sol = new P짝수와홀수();
		System.out.println(sol.solution(5));
	}

}
