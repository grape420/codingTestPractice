package codingTestPractice.BaekJoon;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class P두배열의교집합 {

	public static void main(String[] args) {
		int[] nums1 = {1, 2, 3, 1};
		int[] nums2 = {2, 2};
		 System.out.println(Arrays.toString(intersection(nums1, nums2))); // 출력: [2]
	}
	
	public static int[] intersection(int[] nums1, int[] nums2) {
        // HashSet 사용하여 nums1의 원소를 저장
        Set<Integer> set1 = new HashSet<>();
        for (int num : nums1) {
            set1.add(num);
        }

        // 교집합을 저장할 HashSet
        Set<Integer> intersectionSet = new HashSet<>();
        for (int num : nums2) {
            if (set1.contains(num)) {
                intersectionSet.add(num);
            }
        }

        // HashSet을 배열로 변환
        int[] result = new int[intersectionSet.size()];
        int i = 0;
        for (int num : intersectionSet) {
            result[i++] = num;
        }

        return result;
    }

}
