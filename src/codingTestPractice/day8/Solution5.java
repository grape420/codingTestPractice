package codingTestPractice.day8;

public class Solution5 {

	/*
	 * 평균 구하기
	 * 
	 * 정수를 담고 있는 배열 arr의 평균값을 return하는 함수, solution을 완성해보세요.
	 * 
	 * 제한사항
	 * arr은 길이 1 이상, 100 이하인 배열입니다.
	   arr의 원소는 -10,000 이상 10,000 이하인 정수입니다.
	 */
	
	public double solution(int[] arr) {
        double answer = 0;
        
        if (arr == null) return 0;
        
        int num = 0;
        if (arr != null) {
        	for (int i = 0; i < arr.length; i++) {
            	num += arr[i];
            }
            answer = (double) num / arr.length;
        }

        return answer;
    }
	
	public static void main(String[] args) {
		Solution5 sol = new Solution5();
		int[] arr = null;
		
		sol.solution(arr);
	}
}
