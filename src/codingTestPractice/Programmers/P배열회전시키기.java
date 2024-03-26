package codingTestPractice.Programmers;

import java.util.Arrays;

public class P배열회전시키기 {

	public static void main(String[] args) {
		/*
		 *  문제 설명
			정수가 담긴 배열 numbers와 문자열 direction가 매개변수로 주어집니다. 배열 numbers의 원소를 direction방향으로 한 칸씩 회전시킨 배열을 return하도록 solution 함수를 완성해주세요.
			
			제한사항
			3 ≤ numbers의 길이 ≤ 20
			direction은 "left" 와 "right" 둘 중 하나입니다.
			입출력 예
			numbers						direction	result
			[1, 2, 3]					"right"		[3, 1, 2]
			[4, 455, 6, 4, -1, 45, 6]	"left"		[455, 6, 4, -1, 45, 6, 4]
		 */
		
		int[] numbers = {4, 455, 6, 4, -1, 45, 6};
		String direction = "right";
		
		solution(numbers, direction);
	}

	public static int[] solution(int[] numbers, String direction) {
		int[] answer = new int[numbers.length];
		
		if (direction.equals("left")) {
			for (int i = 0; i < numbers.length - 1; i++) {
				answer[i] = numbers[i + 1];
			}
			answer[answer.length - 1] = numbers[0];
		} else {
			for (int i = 0; i < numbers.length - 1; i++) {
				answer[i + 1] = numbers[i]; 
			}
			answer[0] = numbers[numbers.length - 1];
		}
		
		System.out.println(Arrays.toString(answer));
		
		return answer;
	}

}
