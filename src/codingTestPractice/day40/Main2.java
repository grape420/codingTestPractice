package codingTestPractice.day40;

import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {

		/*
		 * 백준 11720 숫자의 합 구하기
		 * 
		 * 문제
			N개의 숫자가 공백 없이 쓰여있다. 이 숫자를 모두 합해서 출력하는 프로그램을 작성하시오.
			
			입력
			첫째 줄에 숫자의 개수 N (1 ≤ N ≤ 100)이 주어진다. 둘째 줄에 숫자 N개가 공백없이 주어진다.
			
			출력
			입력으로 주어진 숫자 N개의 합을 출력한다.
		 */
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		// 입력값을 String형 변수 sNum에 저장한 후 char[]형 변수로 변환하기
		String sNum = sc.next();
		char[] cNum = sNum.toCharArray();
		
		int sum = 0;
		for (int i = 0; i < cNum.length; i++) {
			sum += cNum[i] - '0';
		}
		System.out.println(sum);
	}

}
