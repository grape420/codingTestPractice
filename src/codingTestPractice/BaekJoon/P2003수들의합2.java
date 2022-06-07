package codingTestPractice.BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class P2003수들의합2 {

	public static void main(String[] args) throws IOException {

		/*
		 * 백준 2003 수들의 합2
		 * 
		 * 문제
			N개의 수로 된 수열 A[1], A[2], …, A[N] 이 있다. 
			이 수열의 i번째 수부터 j번째 수까지의 합 A[i] + A[i+1] + … + A[j-1] + A[j]가 M이 되는 경우의 수를 구하는 프로그램을 작성하시오.
			
			입력
			첫째 줄에 N(1 ≤ N ≤ 10,000), M(1 ≤ M ≤ 300,000,000)이 주어진다. 다음 줄에는 A[1], A[2], …, A[N]이 공백으로 분리되어 주어진다. 
			각각의 A[x]는 30,000을 넘지 않는 자연수이다.
			
			출력
			첫째 줄에 경우의 수를 출력한다.
		 */
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		int[] A = new int[N];
		
		for (int i = 0; i < N; i++) {
			A[i] = Integer.parseInt(st.nextToken());
		}

		System.out.println(twoPointer(A, M));
	}
	static int twoPointer(int[] A, int M) {
		int start = 0, end = 0, count = 0, sum = 0;
		while (true) {
			if (sum >= M) {
				sum -= A[start++];
			} else if (end >= A.length) break;
			else {
				sum += A[end++];
			}
			
			if (sum == M) count++;
		}
		return count;
	}

}
