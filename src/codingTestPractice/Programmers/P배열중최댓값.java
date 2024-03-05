package codingTestPractice.Programmers;

import java.util.Arrays;

public class P배열중최댓값 {

	public static void main(String[] args) {
		
		int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		
		
		// 첫 번째 방법
		/*
		Arrays.sort(arr);
		
		int max = arr[arr.length - 1];
		
		System.out.println("최댓값 : " + max);
		*/
		
		// 두 번째 방법
		int max = arr[0];
		
		for (int i = 0; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}
		}
		
		System.out.println("최댓값 : " + max);

	}

}
