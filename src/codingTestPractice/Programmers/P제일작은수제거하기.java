package codingTestPractice.Programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P제일작은수제거하기 {

	/*
	 * 제일 작은 수 제거하기
	 *
	 * 정수를 저장한 배열, arr 에서 가장 작은 수를 제거한 배열을 리턴하는 함수, solution을 완성해주세요.
	 * 단, 리턴하려는 배열이 빈 배열인 경우엔 배열에 -1을 채워 리턴하세요.
	 * 예를들어 arr이 [4,3,2,1]인 경우는 [4,3,2]를 리턴 하고, [10]면 [-1]을 리턴 합니다.
	 *
	 * 제한사항
	 * arr은 길이 1 이상인 배열입니다.
	   인덱스 i, j에 대해 i ≠ j이면 arr[i] ≠ arr[j] 입니다.
	 */

	public int[] solution(int[] arr) {
		// sort를 이용해서 최솟값 가져오기    
		int[] temp = arr.clone();
		Arrays.sort(temp);
		int min = temp[0];
		//ArrayList를 이용하여 최솟값과 같지 않은 수만 추가
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] != min) {
				list.add(arr[i]);
			}
		}
		
		int[] answer;
		// 경우를 나눠서 배열에 값을 저장하기		
		if(list.size() == 0) {
			answer = new int[1];
			answer[0] = -1;
		} else {
			answer = new int[list.size()];
			for (int i = 0; i < list.size(); i++) {
				answer[i] = list.get(i);
			}
		}
		
        return answer;        
    }

	public static void main(String[] args) {
		P제일작은수제거하기 sol = new P제일작은수제거하기();
		int[] arr = {4, 3, 2, 1};

		sol.solution(arr);
	}



}
