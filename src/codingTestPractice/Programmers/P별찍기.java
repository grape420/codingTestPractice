package codingTestPractice.Programmers;

import java.util.Scanner;

public class P별찍기 {

	public static void main(String[] args) {
		
		/* 기본적인 별 찍기 */
		Scanner sc = new Scanner(System.in);
		System.out.print("가로의 길이를 입력하세요 : ");
		int a = sc.nextInt();
		
		System.out.print("세로의 길이를 입력하세요 : ");
		int b = sc.nextInt();
		
		for (int i = 0; i < b; i++) {
			for (int j = 0; j < a; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
	}
}
