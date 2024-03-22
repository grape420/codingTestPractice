package codingTestPractice.Programmers;

public class P피자나눠먹기1 {

	public static void main(String[] args) {
		/*
		 *  문제 설명
			머쓱이네 피자가게는 피자를 일곱 조각으로 잘라 줍니다. 
			피자를 나눠먹을 사람의 수 n이 주어질 때, 모든 사람이 피자를 한 조각 이상 먹기 위해 필요한 피자의 수를 return 하는 solution 함수를 완성해보세요.
			
			제한사항
			1 ≤ n ≤ 100
			
			입출력 예
			n	result
			7	1
			1	1
			15	3
		 */
		int n = 22;
		
		solution(n);

	}

	public static int solution(int n) {
		int answer = 0;
		
		// 15명이 피자를 먹으려면 총 3판이 필요하다 (피자는 7조각) 20명이 피자를 먹으려면 3판, 22명이면 4판, 29명이면 5판, 14명이면 2판
		if (n % 7 == 0) {
			answer = n / 7;
		} else {
			answer = n / 7 + 1;
		}
		//answer = n % 7 == 0 ? n / 7 : n / 7 + 1;
		
		System.out.println(answer);
		
		
		return answer;
		
	}

}
