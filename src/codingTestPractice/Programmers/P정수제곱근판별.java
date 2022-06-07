package codingTestPractice.Programmers;

public class P정수제곱근판별 {
	
	/*
	 * 정수 제곱근 판별
	 * 
	 * 임의의 양의 정수 n에 대해, n이 어떤 양의 정수 x의 제곱인지 아닌지 판단하려 합니다.
	   n이 양의 정수 x의 제곱이라면 x+1의 제곱을 리턴하고, n이 양의 정수 x의 제곱이 아니라면 -1을 리턴하는 함수를 완성하세요.
	 * 
	 * 제한사항
	 * n은 1이상, 50000000000000 이하인 양의 정수입니다.
	 */
	
	public long solution(long n) {
        long answer = 0;
        
        /*
         * Math.pow(5, 2) = 25 제곱구하기
         * Math.sqrt(25) = 5 루트 구하기
         */
        long x = (long)Math.sqrt(n);
        
        if (n == (x * x)) {
        	answer = (x + 1) * (x + 1); 
        } else {
        	answer = -1;
        }
        
        return answer;
    }
	
	public static void main(String[] args) {
		P정수제곱근판별 sol = new P정수제곱근판별();
		int n = 25;
		
		sol.solution(n);
	}

}
