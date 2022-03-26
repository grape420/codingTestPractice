package codingTestPractice.day13;

import java.util.Arrays;

public class Solution2 {
	
	/*
	 * 자릿수 더하기
	 * 
	 * 자연수 N이 주어지면, N의 각 자릿수의 합을 구해서 return 하는 solution 함수를 만들어 주세요.
       예를들어 N = 123이면 1 + 2 + 3 = 6을 return 하면 됩니다.
       
       제한사항
       N의 범위 : 100,000,000 이하의 자연수
	 */
	
	 public int solution(int n) {
	        int answer = 0;

//	        String[] ss = String.valueOf(n).split("");
//	        
//	        for (int i = 0; i< ss.length; i++) {
//	        	answer += Integer.valueOf(ss[i]);
//	        }
	        
	        while(n > 0) {
	        	answer += n % 10;
	        	n /= 10;
	        }
	        
	        return answer;
	    }
	 
	 public static void main(String[] args) {
		Solution2 sol = new Solution2();
		int n = 987;
		
		sol.solution(n);
	}

}
