package codingTestPractice.Programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P배열뒤집기 {

	public static void main(String[] args) {
		/*
		 *  문제 설명
			정수가 들어 있는 배열 num_list가 매개변수로 주어집니다. num_list의 원소의 순서를 거꾸로 뒤집은 배열을 return하도록 solution 함수를 완성해주세요.
			
			제한사항
			1 ≤ num_list의 길이 ≤ 1,000
			0 ≤ num_list의 원소 ≤ 1,000
			입출력 예
			num_list	result
			[1, 2, 3, 4, 5]	[5, 4, 3, 2, 1]
			[1, 1, 1, 1, 1, 2]	[2, 1, 1, 1, 1, 1]
			[1, 0, 1, 1, 1, 3, 5]	[5, 3, 1, 1, 1, 0, 1]
		 */
		
		int[] num_list = {1, 2, 3, 4, 5};
		
		solution(num_list);

	}
	
	public static int[] solution(int[] num_list) {
		int[] answer = new int[num_list.length];
//		List<Integer> temp = new ArrayList<>();
//		
//		for (int i = num_list.length - 1; i >= 0; i--) {
//			temp.add(num_list[i]);
//		}
//		
//		answer = new int[temp.size()];
//		for (int i = 0; i < answer.length; i++) {
//			answer[i] = temp.get(i);  
//		}
		
		for (int i = 0; i < num_list.length; i++) {
			answer[i] = num_list[num_list.length - 1 - i];
		}
		System.out.println(Arrays.toString(answer));
		
		return answer;
	}

}
