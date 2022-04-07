package codingTestPractice.day22;

public class Solution {
	
	/*
	 * 2016년
	 * 
	 * 2016년 1월 1일은 금요일입니다. 2016년 a월 b일은 무슨 요일일까요? 
	 * 두 수 a ,b를 입력받아 2016년 a월 b일이 무슨 요일인지 리턴하는 함수, solution을 완성하세요. 
	 * 요일의 이름은 일요일부터 토요일까지 각각 SUN,MON,TUE,WED,THU,FRI,SAT입니다. 
	 * 
	 * 예를 들어 a=5, b=24라면 5월 24일은 화요일이므로 문자열 "TUE"를 반환하세요.
	 * 
	 * 제한조건
	 * 2016년은 윤년입니다.
	   2016년 a월 b일은 실제로 있는 날입니다. (13월 26일이나 2월 45일같은 날짜는 주어지지 않습니다)
	   
	   입출력 예
	   a	b	result
	   5	24	"TUE"
	 */
	
	public String solution(int a, int b) {
        /*
         * 1일 - 6 (금)
         * 2일 - 7 (토)
         * 3일 - 1 (일)
         * 4일 - 2 (월)
         * 5일 - 3 (화)
         * 6일 - 4 (수)
         * 7일 - 5 (목)
         * 
         * 31일 - 1월, 3월, 5월, 7월, 8월, 10월, 12월
         * 30일 - 4월, 6월, 9월, 11월
         * 29일 - 2월
         */

        int[] months = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] days = {"SUN","MON","TUE","WED","THU","FRI","SAT"};
        
        int totalDay = 0;
        
        // 월마다 일수 더해주기 
        for (int i = 1; i < a; i++) {
        	totalDay += months[i - 1];
        }
        
        totalDay += b - 1;
        
        return days[(totalDay + 5) % 7];		// 1월 1일이 금요일이므로 + 5로 초기값 설정
    }
	
	public static void main(String[] args) {
		Solution sol = new Solution();
		int a = 5;
		int b = 1;
		
		sol.solution(a, b);
	}

}
