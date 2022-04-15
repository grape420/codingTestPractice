package codingTestPractice.day28;

public class Solution {
	
	/*
	 * 약수의 개수와 덧셈
	 * 
	 * 두 정수 left와 right가 매개변수로 주어집니다. 
	 * left부터 right까지의 모든 수들 중에서, 약수의 개수가 짝수인 수는 더하고, 약수의 개수가 홀수인 수는 뺀 수를 return 하도록 solution 함수를 완성해주세요.
	 * 
	 * 제한사항
	   1 ≤ left ≤ right ≤ 1,000
	   
	   입출력 예
		left	right	result
		13	    17	    43
		24	    27	    52
		
		입출력 예 #1
		다음 표는 13부터 17까지의 수들의 약수를 모두 나타낸 것입니다.
		수	약수	약수의 개수
		13	1, 13	2
		14	1, 2, 7, 14	4
		15	1, 3, 5, 15	4
		16	1, 2, 4, 8, 16	5
		17	1, 17	2
		따라서, 13 + 14 + 15 - 16 + 17 = 43을 return 해야 합니다.
	 */
	
	public int solution(int left, int right) {
        int answer = 0;
        int num = 0;
        
        for (int i = left; i <= right; i++) {
        	System.out.println(i + "의 약수의 개수 : " + count(i));
        	num = i;
        	if (count(i) % 2 != 0) {
        		num = i * -1;
        	}
        	answer += num;
        }
        System.out.println(answer);
        return answer;
    }
	
	// 약수의 개수 구하는 메소드
	public int count(int n) {
		int cnt = 0;
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) cnt++;
		}
		return cnt;
	}
	
	
	public static void main(String[] args) {
		Solution sol = new Solution();
		int left = 13;
		int right = 17;
		
		sol.solution(left, right);
	}

}
