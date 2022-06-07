package codingTestPractice.Programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P같은숫자는싫어 {
	
	/*
	 * 같은 숫자는 싫어
	 * 
	 * 배열 arr가 주어집니다. 배열 arr의 각 원소는 숫자 0부터 9까지로 이루어져 있습니다. 
	 * 이때, 배열 arr에서 연속적으로 나타나는 숫자는 하나만 남기고 전부 제거하려고 합니다. 
	 * 단, 제거된 후 남은 수들을 반환할 때는 배열 arr의 원소들의 순서를 유지해야 합니다. 예를 들면,
	   arr = [1, 1, 3, 3, 0, 1, 1] 이면 [1, 3, 0, 1] 을 return 합니다.
	   arr = [4, 4, 4, 3, 3] 이면 [4, 3] 을 return 합니다.
	   배열 arr에서 연속적으로 나타나는 숫자는 제거하고 남은 수들을 return 하는 solution 함수를 완성해 주세요.
	   
	   제한사항
	   배열 arr의 크기 : 1,000,000 이하의 자연수
	   배열 arr의 원소의 크기 : 0보다 크거나 같고 9보다 작거나 같은 정수	
	 */
	
	public int[] solution(int[] arr) {
        int[] answer = {};        
        List<Integer> list = new ArrayList<Integer>();			// 옮겨 담을 ArraysList 생성
        list.add(arr[0]);										// 반복문이 1번 인덱스부터 비교하기 때문에 0번 인덱스를 미리 넣어준다.
        
        for (int i = 1; i < arr.length; i++) {					// 1번 인덱스부터 그 다음 인덱스를 비교해 다르면 ArrayList에 추가한다.
        	if (arr[i] != arr[i - 1]) {
        		list.add(arr[i]);
        	}
        }
        
        answer = new int[list.size()];							// 중복을 제거한 list의 사이즈만큼 int[] 배열 생성
        
        for (int i = 0; i < list.size(); i++) {					// 중복을 제거한 list의 값들을 int[] 배열로 옮겨 담음.
        	answer[i] = list.get(i);
        }
        System.out.println(Arrays.toString(answer));

        return answer;
    }
	
	public static void main(String[] args) {
		P같은숫자는싫어 sol = new P같은숫자는싫어();
		int[] arr = {1,1,1,3,3,0,1,1};
		
		sol.solution(arr);
	}

}
