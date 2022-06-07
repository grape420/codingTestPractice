package codingTestPractice.Programmers;

import java.util.ArrayList;

public class P소수찾기2 {

	/*
	 * 프로그래머스 소수 찾기
	 * 
	 * 한자리 숫자가 적힌 종이 조각이 흩어져있습니다. 흩어진 종이 조각을 붙여 소수를 몇 개 만들 수 있는지 알아내려 합니다.
	 * 
	 * 각 종이 조각에 적힌 숫자가 적힌 문자열 numbers가 주어졌을 때, 종이 조각으로 만들 수 있는 소수가 몇 개인지 return 하도록
	 * solution 함수를 완성해주세요.
	 * 
	 * 제한사항 numbers는 길이 1 이상 7 이하인 문자열입니다. numbers는 0~9까지 숫자만으로 이루어져 있습니다. "013"은 0,
	 * 1, 3 숫자가 적힌 종이 조각이 흩어져있다는 의미입니다. 입출력 예 numbers return "17" 3 "011" 2 입출력 예 설명
	 * 예제 #1 [1, 7]으로는 소수 [7, 17, 71]를 만들 수 있습니다.
	 * 
	 * 예제 #2 [0, 1, 1]으로는 소수 [11, 101]를 만들 수 있습니다.
	 */

	int answer;
	boolean[] check = new boolean[10];
	ArrayList<Integer> arr = new ArrayList<>();

	void dfs(String str, String tmp, int m) {
		if (tmp.length() == m) {
			int num = Integer.parseInt(tmp);
			if (!arr.contains(num))
				arr.add(num);
			return;
		} else {
			for (int i = 0; i < str.length(); i++) {
				if (!check[i]) {
					check[i] = true;
					tmp += str.charAt(i);
					dfs(str, tmp, m);
					check[i] = false;
					tmp = tmp.substring(0, tmp.length() - 1);
				}
			}
		}
	}

	void is_prime(int n) {
		if (n == 0)
			return;
		if (n == 1)
			return;
		for (int i = 2; i < n; i++) {
			if (n % i == 0)
				return;
		}
		answer++;
	}

	public int solution(String numbers) {
		String tmp = "";
		for (int i = 0; i < numbers.length(); i++) {
			dfs(numbers, tmp, i + 1);
		}
		for (int i = 0; i < arr.size(); i++) {
			is_prime(arr.get(i));
		}
		return answer;
	}

	public static void main(String[] args) {
		P소수찾기2 sol = new P소수찾기2();
		String numbers = "17";

		System.out.println(sol.solution(numbers));
	}

}
