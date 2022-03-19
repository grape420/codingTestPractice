package codingTestPractice.day7;

public class Solution2 {
	
	/*
	 * 수박수박수박수박수박수?
	 * 
	 * 길이가 n이고, "수박수박수박수...."와 같은 패턴을 유지하는 문자열을 리턴하는 함수, solution을 완성하세요. 
	 * 예를들어 n이 4이면 "수박수박"을 리턴하고 3이라면 "수박수"를 리턴하면 됩니다.
	 */

	public String solution(int n) {
		String answer = "";
		
		for (int i = 0; i < n; i++) {
			answer += i % 2 == 0 ? "수" : "박";
		}
		
		System.out.println(answer);
		return answer;
	}
	
	public static void main(String[] args) {
		Solution2 sol = new Solution2();
		sol.solution(5);
	}
}
