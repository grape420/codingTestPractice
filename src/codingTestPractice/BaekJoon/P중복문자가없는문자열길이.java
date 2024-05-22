package codingTestPractice.BaekJoon;

import java.util.HashSet;
import java.util.Set;

public class P중복문자가없는문자열길이 {

	public static void main(String[] args) {
        String str = "abcabcbb";
        System.out.println(lengthOfLongestSubstring(str)); // 출력: 3
    }

    public static int lengthOfLongestSubstring(String s) {
    	// 문자열이 null이거나 길이가 0이면 0반환
        if (s == null || s.length() == 0) return 0;
        
        // HashSet을 이용하여 중복 문자 확인
        Set<Character> set = new HashSet<>();
        int maxLength = 0;
        
        // 두 포인터 left와 right를 이용하여 슬라이딩 윈도우 설정
        int left = 0;
        
        // right 포인터를 이동시키면서 현재 문자가 HashSet에 이미 존재하면 left 포인터를 이동시키며 HashSet에서 문자를 제거
        for (int right = 0; right < s.length(); right++) {
            while (set.contains(s.charAt(right))) {
                set.remove(s.charAt(left));
                left++;
            }
            // 중복이 아닌 문자를 HashSet에 추가하고 최대 길이 갱신
            set.add(s.charAt(right));
            maxLength = Math.max(maxLength, right - left + 1);
        }
        
        return maxLength;
    }

}
