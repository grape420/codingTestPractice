package codingTestPractice.BaekJoon;

public class P가장긴접두어 {

	public static void main(String[] args) {
		String[] arr = {"flower", "flow", "flight", "fl12345", "fl@31"};
		System.out.println(longestCommonPrefix(arr));
	}
	
	public static String longestCommonPrefix(String[] strs) {
		   // 문자열 배열이 null이거나 비어있는 경우 빈 문자열을 반환
	       if (strs == null || strs.length == 0) return "";
	       
	       // 첫 번째 문자열을 기준으로 설정
	       String prefix = strs[0];
	       for (int i = 1; i < strs.length; i++) {
	    	   // 나머지 문자열들과 첫 번째 문자열(prefix)을 비교하면서, 공통 접두사가 아닐 때마다 prefix의 마지막 문자를 하나씩 제거
	           while (strs[i].indexOf(prefix) != 0) {
	               prefix = prefix.substring(0, prefix.length() - 1);
	               if (prefix.isEmpty()) return "";
	           }
	       }
	       return prefix;
	   }

}
