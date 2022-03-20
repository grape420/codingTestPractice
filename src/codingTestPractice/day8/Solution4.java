package codingTestPractice.day8;

public class Solution4 {

	/*
	 * 하샤드 수
	 * 
	 * 양의 정수 x가 하샤드 수이려면 x의 자릿수의 합으로 x가 나누어져야 합니다. 
	 * 예를 들어 18의 자릿수 합은 1+8=9이고, 18은 9로 나누어 떨어지므로 18은 하샤드 수입니다. 
	 * 자연수 x를 입력받아 x가 하샤드 수인지 아닌지 검사하는 함수, solution을 완성해주세요.
	 * 
	 * 제한 조건
	 * x는 1 이상, 10000 이하인 정수입니다.
	 */
	
	public boolean solution(int x) {
        boolean answer = true;
        
        String str = String.valueOf(x);
        char[] charArr = str.toCharArray();
        
        int num = 0;
        int sum = 0;
        for (int i = 0; i < charArr.length; i++) {
        	String str2 = String.valueOf(charArr[i]);
        	num = Integer.valueOf(str2);
        	sum += num;
        }
        
        if (x % sum == 0) answer = true;
        else answer = false;
        
        return answer;
    }
	
	public static void main(String[] args) {
		Solution4 sol = new Solution4();
		int x = 13;
		
		sol.solution(x);
	}
}
