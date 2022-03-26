package codingTestPractice.day12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution2 {
    
    /*
     * 자연수 뒤집어 배열 만들기

       자연수 n을 뒤집어 각 자리 숫자를 원소로 가지는 배열 형태로 리턴해주세요. 예를들어 n이 12345이면 [5,4,3,2,1]을 리턴합니다.
     */ 
    public int[] solution(long n) {        
//        List<Integer> list = new ArrayList<>();
//
//        while(n != 0) {
//            list.add((int)(n % 10));
//            n /= 10;
//        }
//
//        int[] answer = new int[list.size()];
//        for (int i = 0; i < list.size(); i++) {
//            answer[i] = list.get(i);
//        }
//        return answer;
    	
    	String str = String.valueOf(n);
    	StringBuilder sb = new StringBuilder(str);
    	sb = sb.reverse();
    	String[] ss = sb.toString().split("");
    	
    	int[] answer = new int[ss.length];
    	for (int i = 0; i < ss.length; i++) {
    		answer[i] = Integer.valueOf(ss[i]);
    	}
    	
    	return answer;
    }
    
    public static void main(String[] args) {
		Solution2 sol = new Solution2();
		long n = 12345;
		sol.solution(n);
	}
}
