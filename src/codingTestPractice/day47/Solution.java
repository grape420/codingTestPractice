package codingTestPractice.day47;

public class Solution {
	
	/*
	 * 프로그래머스 전화번호 목록
	 * 
	 * 문제 설명
		전화번호부에 적힌 전화번호 중, 한 번호가 다른 번호의 접두어인 경우가 있는지 확인하려 합니다.
		전화번호가 다음과 같을 경우, 구조대 전화번호는 영석이의 전화번호의 접두사입니다.
		
		구조대 : 119
		박준영 : 97 674 223
		지영석 : 11 9552 4421
		전화번호부에 적힌 전화번호를 담은 배열 phone_book 이 solution 함수의 매개변수로 주어질 때, 어떤 번호가 다른 번호의 접두어인 경우가 있으면 false를 그렇지 않으면 true를 return 하도록 solution 함수를 작성해주세요.
		
		제한 사항
		phone_book의 길이는 1 이상 1,000,000 이하입니다.
		각 전화번호의 길이는 1 이상 20 이하입니다.
		같은 전화번호가 중복해서 들어있지 않습니다.
		입출력 예제
		phone_book	return
		["119", "97674223", "1195524421"]	false
		["123","456","789"]	true
		["12","123","1235","567","88"]	false
		입출력 예 설명
		입출력 예 #1
		앞에서 설명한 예와 같습니다.
		
		입출력 예 #2
		한 번호가 다른 번호의 접두사인 경우가 없으므로, 답은 true입니다.
		
		입출력 예 #3
		첫 번째 전화번호, “12”가 두 번째 전화번호 “123”의 접두사입니다. 따라서 답은 false입니다.
	 */
	
	public static boolean solution(String[] phone_book) {
    	//phone_book의 마지막 전 원소까지 반복
    	for(int i=0; i<phone_book.length -1; i++) {
    		//String.hashCode(): 문자열의 해쉬코드 반환
    		//i번째 전화번호에 해쉬코드 부여
    		int hashPhone = phone_book[i].hashCode();
    		int len = phone_book[i].length();
    		
    		//j는 i+1부터 phone_book의 마지막 원소까지 탐색, i가 증가할 때마다 초기화
    		for(int j=i+1; j< phone_book.length; j++) {
    			//i번째 전화번호보다 j번째 전화번호의 길이가 길고,
    			//i번째 전화번호의 길이만큼 j번째 전화번호의 substring의 해쉬값이 같음.(j가 i 문자열로 시작)
    			if(phone_book[j].length() >=len && 
    					hashPhone == (phone_book[j].substring(0, len).hashCode())){
    				return false;
    			}
    			//j번째 전화번호보다 i번째 전화번호의 길이가 길고,
    			//j번째 전화번호의 길이만큼 i번째 전화번호의 substring의 해쉬값이 같음.(i가 j 문자열로 시작)
    			else if(phone_book[j].length()<len && 
    					phone_book[i].substring(0, phone_book[j].length())
    					.hashCode() == phone_book[j].hashCode()) {
    				return false;
    			}
			}
    	}
    	//위 상황에 해당하는 case가 없으면 true 반환
        return true;
    }
	
	public static void main(String[] args) {
		Solution sol = new Solution();
		String[] phone_book = {"119", "97674223", "1195524421"};
		
		System.out.println(sol.solution(phone_book));
	}

}
