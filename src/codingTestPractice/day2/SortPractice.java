package codingTestPractice.day2;

import java.util.Arrays;

public class SortPractice {

	public static void main(String[] args) {
		int[] arr = {45, 26, 18, 21, 15};
//		Arrays.sort(arr);
		
		int temp = 0;
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < i; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);

			if (i != arr.length - 1)
				System.out.print(", ");
		}
	}

}
