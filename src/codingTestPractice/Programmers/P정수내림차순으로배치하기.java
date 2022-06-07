package codingTestPractice.Programmers;

import java.util.Arrays;

public class P정수내림차순으로배치하기 {
	
	/*
	 * 정수 내림차순으로 배치하기
	 * 
	 * 함수 solution은 정수 n을 매개변수로 입력받습니다. 
	 * n의 각 자릿수를 큰것부터 작은 순으로 정렬한 새로운 정수를 리턴해주세요. 
	 * 예를들어 n이 118372면 873211을 리턴하면 됩니다.
	 * 
	 * 제한 조건
	 * n은 1이상 8000000000 이하인 자연수입니다.
	 */
	
	public long solution(long n) {
        long answer = 0;
        
        String str = String.valueOf(n);
        StringBuilder sb = new StringBuilder(str);
        String[] ss = sb.toString().split("");
        
        long[] iArr = new long[ss.length];
        for (int i = 0; i< iArr.length; i++) {
        	iArr[i] = Long.valueOf(ss[i]);
        }
        
        
        for (int i = 0; i < iArr.length; i++) {
        	for (int j = i + 1; j < iArr.length; j++) {
        		if (iArr[i] < iArr[j]) {
        			long temp = iArr[i];
        			iArr[i] = iArr[j];
        			iArr[j] = temp;
        		}
        	}
        }
        
        System.out.println(Arrays.toString(iArr));
        
        String s = "";
        for (int i = 0; i < iArr.length; i++) {
        	s +=iArr[i];
        }
        
        System.out.println(s);
        
        answer = Long.valueOf(s);
        
        return answer;
    }
	
	public static void main(String[] args) {
		P정수내림차순으로배치하기 sol = new P정수내림차순으로배치하기();
		long n = 118372;
		
		sol.solution(n);
	}

}
