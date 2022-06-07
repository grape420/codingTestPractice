package codingTestPractice.Programmers;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class P소수찾기 {
	
	/*
	 * 소수 찾기
		문제 설명
		한자리 숫자가 적힌 종이 조각이 흩어져있습니다. 흩어진 종이 조각을 붙여 소수를 몇 개 만들 수 있는지 알아내려 합니다.
		
		각 종이 조각에 적힌 숫자가 적힌 문자열 numbers가 주어졌을 때, 종이 조각으로 만들 수 있는 소수가 몇 개인지 return 하도록 solution 함수를 완성해주세요.
		
		제한사항
		numbers는 길이 1 이상 7 이하인 문자열입니다.
		numbers는 0~9까지 숫자만으로 이루어져 있습니다.
		"013"은 0, 1, 3 숫자가 적힌 종이 조각이 흩어져있다는 의미입니다.
		입출력 예
		numbers	return
		"17"	3
		"011"	2
		입출력 예 설명
		예제 #1
		[1, 7]으로는 소수 [7, 17, 71]를 만들 수 있습니다.
		
		예제 #2
		[0, 1, 1]으로는 소수 [11, 101]를 만들 수 있습니다.
		
		11과 011은 같은 숫자로 취급합니다.
	 */
	
	Set<Integer> numbersSet = new HashSet<>();

    public boolean isPrime(int num) {
        // 1. 0과 1은 소수가 아니다
        if (num == 0 || num == 1)
            return false;

        // 2. 에라토스테네스의 체의 limit 숫자를 계산한다.
        int lim = (int)Math.sqrt(num);

        // 3. 에라토스테네스의 체에 따라 lim까지 배수 여부를 확인한다.
        for (int i = 2; i <= lim; i++)
            if (num % i == 0)
                return false;

        return true;
    }

    public void recursive(String comb, String others) {
        // 1. 현재 조합을 set에 추가한다.
        if (!comb.equals(""))
            numbersSet.add(Integer.valueOf(comb));

        // 2. 남은 숫자 중 한 개를 더해 새로운 조합을 만든다.
        for (int i = 0; i < others.length(); i++)
            recursive(comb + others.charAt(i), others.substring(0, i) + others.substring(i + 1));
    }
	
	public int solution(String numbers) {
        // 1. 모든 조합의 숫자를 만든다.
        recursive("", numbers);

        // 2. 소수의 개수만 센다.
        int count = 0;
        Iterator<Integer> it = numbersSet.iterator();
        while (it.hasNext()) {
            int number = it.next();
            if (isPrime(number))
                count++;
        }

        // 3. 소수의 개수를 반환한다.
        return count;
    }
	
	public static void main(String[] args) {
		P소수찾기 sol = new P소수찾기();
		String numbers = "17";
		
		sol.solution(numbers);
	}

}
