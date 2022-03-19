package codingTestPractice.day7;

public class Solution {
	
	/*
	 * 소수 찾기
	 * 
	 * 1부터 입력받은 숫자 n 사이에 있는 소수의 개수를 반환하는 함수, solution을 만들어 보세요.

		소수는 1과 자기 자신으로만 나누어지는 수를 의미합니다.
		(1은 소수가 아닙니다.)
	 */

	public int solution(int n) {
        int answer = 0;
        // 에라토스테네스의 체 역할 
        int[] check = new int[n+1];    
        // 0과 1은 애초에 소수가 아님 배제
        // 초기화 chech의 i번째는 0만 아니도록 초기화해주면 된다.
        for(int i=2;i<n+1;i++) {
            check[i] = 1;
        }
        
        for (int i=2;i<n;i++) {
            // check[i]가 0이라는 것은 해당 i가 소수가 아니라는 의미
            if (check[i] == 0) continue;
            // continue처리가 되지 않고 아래 for문으로 들어왔다는 것은 
            // i가 소수라는 것.
            // i번째를 제외하고 자신의 배수는 모두 소수가 아님 (=check의 자기 배수 번째를 모두 0으로 처리)
            for(int j=i*2; j<=n; j+=i) {
                check[j] = 0;
            }
        }
        // check의 0이 아닌 원소의 수가 소수의 개수
        for (int i=1;i<check.length;i++) {
            if (check[i]!=0) answer++;
        }
        System.out.println(answer);
        return answer;
    }
	
	public static void main(String[] args) {
		Solution sol = new Solution();
		sol.solution(10);
	}
}
