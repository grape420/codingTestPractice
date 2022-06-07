package codingTestPractice.BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class P1929소수구하기 {

	public static void main(String[] args) throws IOException {

		/*
		 * 백준 1929 소수 구하기
		 * 
		 * 문제
			M이상 N이하의 소수를 모두 출력하는 프로그램을 작성하시오.
			
			입력
			첫째 줄에 자연수 M과 N이 빈 칸을 사이에 두고 주어진다. (1 ≤ M ≤ N ≤ 1,000,000) M이상 N이하의 소수가 하나 이상 있는 입력만 주어진다.
			
			출력
			한 줄에 하나씩, 증가하는 순서대로 소수를 출력한다.
		 */
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("M과 N를 입력하세요 : ");
		String[] str = br.readLine().split(" ");
		
		int M = Integer.parseInt(str[0]);
		int N = Integer.parseInt(str[1]);
		int[] A = new int[N + 1];
		
		// 소수 배열 만들기
		for (int i = 1; i <= N; i++) {
			A[i] = i;
		}
		System.out.println("전 : " + Arrays.toString(A));
		
		// N의 제곱근까지 반복
		for (int i = 2; i <= Math.sqrt(N); i++) {
			// 소수가 아니면 넘어감
			if (A[i] == 0) continue;
			// 소수의 배수 값을 N까지 반복
			for (int j = i + i; j <= N; j += i) {
				System.out.println("i : " + i + ", j : " + j + " ");
				A[j] = 0;
			}
		}
		System.out.println("후 : " + Arrays.toString(A));
		for (int i = M; i <= N; i++) {
			// 소수만 출력
			if (A[i] != 0) {
				System.out.println(A[i]);
			}
		}
	}
}
