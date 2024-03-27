package codingTestPractice.Programmers;

public class P369게임 {

	public static void main(String[] args) {
		/*
		 *  문제 설명
			머쓱이는 친구들과 369게임을 하고 있습니다. 
			369게임은 1부터 숫자를 하나씩 대며 3, 6, 9가 들어가는 숫자는 숫자 대신 3, 6, 9의 개수만큼 박수를 치는 게임입니다. 
			머쓱이가 말해야하는 숫자 order가 매개변수로 주어질 때, 머쓱이가 쳐야할 박수 횟수를 return 하도록 solution 함수를 완성해보세요.
			
			제한사항
			1 ≤ order ≤ 1,000,000
			입출력 예
			order	result
			3		1
			29423	2
		 */
		
		int order = 33333;
		
		solution(order);
	}

	public static int solution(int order) {
		int answer = 0;
		String temp = Integer.toString(order);
		for (int i = 0; i < temp.length(); i++) {
			char c = temp.charAt(i);
			if (Integer.parseInt(c + "") == 3) {
				answer ++;
			} else if (Integer.parseInt(c + "") == 6) {
				answer ++;
			} else if (Integer.parseInt(c + "") == 9) {
				answer ++;
			}
		}
		
		return answer;
	}

}
