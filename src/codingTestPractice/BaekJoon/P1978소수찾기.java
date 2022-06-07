package codingTestPractice.BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P1978소수찾기 {

	public static void main(String[] args) throws IOException {

		/*
		 * 백준 1978 소수 찾기
		 * 
		 * 주어진 수 N개 중에서 소수가 몇 개인지 찾아서 출력하는 프로그램을 작성하시오.

			입력
			첫 줄에 수의 개수 N이 주어진다. N은 100이하이다. 다음으로 N개의 수가 주어지는데 수는 1,000 이하의 자연수이다.
			
			출력
			주어진 수들 중 소수의 개수를 출력한다.
		 */
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("숫자를 하나 입력하세요 : ");
		StringTokenizer st = new StringTokenizer(br.readLine());

		int N = Integer.parseInt(st.nextToken());
		for (int i = 0; i < N; i++) {
			
		}
		
		
	}

}
