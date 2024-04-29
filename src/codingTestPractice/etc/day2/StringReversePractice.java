package codingTestPractice.etc.day2;

public class StringReversePractice {

	public static void main(String[] args) {
		String str = "abcde";
		
		/* 1. StringBuilder, StringBuffer 이용 */
		
//		StringBuffer sb = new StringBuffer(str);
//		String reversedStr = sb.reverse().toString();
//		
//		System.out.println(reversedStr);
		
		/* 2. 반복문 사용 */
		String reverseStr = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			reverseStr = reverseStr + str.charAt(i);
		}
		
		System.out.println(reverseStr);
	}

}
