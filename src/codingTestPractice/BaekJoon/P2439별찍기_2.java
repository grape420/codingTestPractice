package codingTestPractice.BaekJoon;

public class P2439별찍기_2 {
	
	/*
	 * 백준 2439 별 찍기 - 2
	 */

	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5 - i; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
