package codingTestPractice.etc.day1;

public class Practice1 {

	public static void main(String[] args) {
		// 1 ~ 100까지 더하기
//		int sum = 0;
//		for (int i = 1; i <= 100; i++) {
//			sum += i;
//		}
		
//		System.out.println("1~100까지 더한 수 : " + sum);
		
		// for문을 이용한 구구단 만들기
//		for (int i = 1; i <= 9; i++) {
//			for (int j = 1; j <= 9; j++) {
//				System.out.println(i + " x " + j + " = " + i * j);
//			}
//		}
		
		// 구구단 3단에서 4의 배수 제외하고 출력
//		int count = 0;
//		for (int i = 1; i <= 9; i++) {
//			if (!((i * 3) % 4 == 0)) {
//				count++;
//				System.out.println("4의 배수를 제외한 3단 : " + i * 3);
//			}
//		}
//		System.out.println("총 갯수 : " + count);
		
		// 로또 번호 생성기
//		int[] ball = new int[45];		// 로또 공 45개 생성
//		for (int i = 0; i < ball.length; i++) {
//			ball[i] = i + 1;		// 로또 공마다 번호를 붙여줌
//		}
//		
//		int tmp = 0;		// shuffle을 위한 빈 공간 생성
//		int lotto = 0;		// 랜덤한 로또 공 번호를 위해 생성
//		for (int i = 0; i < 777; i++) {
//			lotto = (int)(Math.random() * 44);		// 0 ~ 44 임의의 값을 구함
//			tmp = ball[0];
//			ball[0] = ball[lotto];
//			ball[lotto] = tmp;
//		}
//		
//		for (int i = 0; i < 6; i++) {
//			System.out.println(ball[i] + " / ");
//		}
		
		// 1부터 1000까지 3이나 5의 배수의 합
//		int sum = 0;
//		for (int i = 1; i <= 1000; i++) {
//			if (i % 3 == 0 || i % 5 == 0) {
//				sum += i;
//			}
//		}
//		System.out.println("1부터 1000까지 합 : " + sum);
		
		System.out.println(print(1000));
		
		for (int i = 0; i < 50; i++) {
			int randomValue = (int)(Math.random() * 10) + 1;
			System.out.println("randomValue : " + randomValue);
		}
		
	}
	
	
	
	public static int print(int Max) {
		int sum = 0;
		for (int i = 1; i <= Max; i++) {
			if (i % 3 == 0 || i % 5 == 0) {
				sum += i;
			}
		}
		return sum;
	}
	

	

}
