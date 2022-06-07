package codingTestPractice.BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P10871X보다작은수 {

	public static void main(String[] args) throws IOException {

		/*
		 * 백준 10871 X보다 작은 수
		 * 
		 * 문제
			정수 N개로 이루어진 수열 A와 정수 X가 주어진다. 이때, A에서 X보다 작은 수를 모두 출력하는 프로그램을 작성하시오.
			
			입력
			첫째 줄에 N과 X가 주어진다. (1 ≤ N, X ≤ 10,000)
			
			둘째 줄에 수열 A를 이루는 정수 N개가 주어진다. 주어지는 정수는 모두 1보다 크거나 같고, 10,000보다 작거나 같은 정수이다.
			
			출력
			X보다 작은 수를 입력받은 순서대로 공백으로 구분해 출력한다. X보다 작은 수는 적어도 하나 존재한다.
		 */
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("N과 x를 입력하세요 : ");
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int N = Integer.parseInt(st.nextToken());
		int x = Integer.parseInt(st.nextToken());
		
		StringBuilder sb = new StringBuilder();
		
		System.out.print("숫자 x개를 입력하세요 : ");
		st = new StringTokenizer(br.readLine(), " ");
		
		for (int i = 0; i < N; i++) {
			int value = Integer.parseInt(st.nextToken());
			if (value < x) sb.append(value).append(" ");
		}
		System.out.println(sb);
	}

}
