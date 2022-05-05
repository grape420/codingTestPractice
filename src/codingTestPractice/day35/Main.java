package codingTestPractice.day35;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("연도를 입력하세요 : ");
		int year = sc.nextInt();
		
		sc.close();
		
		if (year % 4 == 0) {
			if (year % 400 == 0) System.out.println("1");
			else if (year % 100 == 0) System.out.println("0");
			else System.out.println("1");
		} else {
			System.out.println("0");
		}
	}

}