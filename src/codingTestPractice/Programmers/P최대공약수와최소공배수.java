package codingTestPractice.Programmers;

public class P최대공약수와최소공배수 {

	/*
	 * 최대공약수와 최소공배수
	 * 
	 * 두 수를 입력받아 두 수의 최대공약수와 최소공배수를 반환하는 함수, solution을 완성해 보세요. 배열의 맨 앞에 최대공약수, 그다음
	 * 최소공배수를 넣어 반환하면 됩니다. 예를 들어 두 수 3, 12의 최대공약수는 3, 최소공배수는 12이므로 solution(3, 12)는
	 * [3, 12]를 반환해야 합니다.
	 * 
	 * 제한사항 두 수는 1이상 1000000이하의 자연수입니다.
	 */

	public int[] solution(int n, int m) {
		int[] answer = new int[2];
		answer[0] = gcd(n, m);
		answer[1] = n * m / answer[0];

		return answer;
	}

	int gcd(int a, int b) {
		while (b != 0) {
			int r = a % b;
			a = b;
			b = r;
		}
		return a;
	}

	public static void main(String[] args) {
		P최대공약수와최소공배수 sol = new P최대공약수와최소공배수();
		int n = 3;
		int m = 12;
		sol.solution(n, m);
	}
}
