package codingTestPractice.day20;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution2 {
	
	/*
	 * 나누어 떨어지는 숫자 배열
	 * 
	 * array의 각 element 중 divisor로 나누어 떨어지는 값을 오름차순으로 정렬한 배열을 반환하는 함수, solution을 작성해주세요.
	   divisor로 나누어 떨어지는 element가 하나도 없다면 배열에 -1을 담아 반환하세요.
	   
	   제한 사항
	   arr은 자연수를 담은 배열입니다.
	   정수 i, j에 대해 i ≠ j 이면 arr[i] ≠ arr[j] 입니다.
	   divisor는 자연수입니다.
	   array는 길이 1 이상인 배열입니다.
	 */
	
	public int[] solution(int[] arr, int divisor) {
		int[] answer = {};
		List<Integer> list = new ArrayList<>();			// arr 숫자들을 담을 ArrayList 생성 
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % divisor == 0) {				// arr 숫자 중의 divisor로 나눠서 나누어떨어지면 list에 담음.
				list.add(arr[i]);
			} 
		}
		if (list.size() == 0) list.add(-1);				// 나누어떨어지는 수가 없으면 -1 리턴
		
		answer = new int[list.size()];
		for (int i = 0; i < list.size(); i++) {
			answer[i] = list.get(i);					// list에서 int 배열로 옮겨 담는 작업
		}
		Arrays.sort(answer);							// 정렬 후 리턴
		System.out.println(Arrays.toString(answer));
		
		return answer;
    }

	public static void main(String[] args) {
		Solution2 sol = new Solution2();
		int[] arr = {2, 36, 1, 3};
		int divisor = 1;
		
		sol.solution(arr, divisor);
	}
}
