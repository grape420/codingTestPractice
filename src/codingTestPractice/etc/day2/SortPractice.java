package codingTestPractice.etc.day2;

import java.util.Arrays;

public class SortPractice {

	public static void main(String[] args) {
		int[] arr = {45, 26, 18, 21, 15};
//		Arrays.sort(arr);
		
		int temp = 0;
		for (int i = 0; i < arr.length - 1; i++) {			// i는 0 ~ 4번 총 5번 반복	
			for (int j = i + 1; j < arr.length; j++) {		// j는 1 ~ 5번 총 5번 반복
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
//		
//		for (int i = 0; i < arr.length; i++) {
//			System.out.print(arr[i]);
//
//			if (i != arr.length - 1)
//				System.out.print(", ");
//		}
	}

}
