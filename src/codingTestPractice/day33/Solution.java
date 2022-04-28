package codingTestPractice.day33;

public class Solution {
	
	/*
	 * 신규 아이디 추천
	 * 
	 * 아이디의 길이는 3자 이상 15자 이하여야 합니다.
		아이디는 알파벳 소문자, 숫자, 빼기(-), 밑줄(_), 마침표(.) 문자만 사용할 수 있습니다.
		단, 마침표(.)는 처음과 끝에 사용할 수 없으며 또한 연속으로 사용할 수 없습니다.
		
		1단계 new_id의 모든 대문자를 대응되는 소문자로 치환합니다.
		2단계 new_id에서 알파벳 소문자, 숫자, 빼기(-), 밑줄(_), 마침표(.)를 제외한 모든 문자를 제거합니다.
		3단계 new_id에서 마침표(.)가 2번 이상 연속된 부분을 하나의 마침표(.)로 치환합니다.
		4단계 new_id에서 마침표(.)가 처음이나 끝에 위치한다면 제거합니다.
		5단계 new_id가 빈 문자열이라면, new_id에 "a"를 대입합니다.
		6단계 new_id의 길이가 16자 이상이면, new_id의 첫 15개의 문자를 제외한 나머지 문자들을 모두 제거합니다.
		     만약 제거 후 마침표(.)가 new_id의 끝에 위치한다면 끝에 위치한 마침표(.) 문자를 제거합니다.
		7단계 new_id의 길이가 2자 이하라면, new_id의 마지막 문자를 new_id의 길이가 3이 될 때까지 반복해서 끝에 붙입니다.
		
		[문제]
		신규 유저가 입력한 아이디를 나타내는 new_id가 매개변수로 주어질 때, "네오"가 설계한 7단계의 처리 과정을 거친 후의 추천 아이디를 return 하도록 solution 함수를 완성해 주세요.
		
		[제한사항]
		new_id는 길이 1 이상 1,000 이하인 문자열입니다.
		new_id는 알파벳 대문자, 알파벳 소문자, 숫자, 특수문자로 구성되어 있습니다.
		new_id에 나타날 수 있는 특수문자는 -_.~!@#$%^&*()=+[{]}:?,<>/ 로 한정됩니다.
	 */
	
	public String solution(String new_id) {
        String id = new_id.toLowerCase(); // 소문자로 
        id = id.replaceAll("[^-_.a-z0-9]", ""); //-_. 영문자 숫자만 남김 
        id = id.replaceAll("[.]{2,}", "."); // .2개 이상 .으로 
        id = id.replaceAll("^[.]|[.]$", ""); // 처음과 끝 . 제거 

        if(id.equals("")) // 빈 문자열이라면 a 추가 
            id += "a";
            
        if(id.length() >= 16){ // 16자 이상이면 15자로 
            id = id.substring(0, 15);
            id = id.replaceAll("^[.]|[.]$", ""); // 끝 . 제거 
        }
        if(id.length() <= 2) // 2자 이하라면 3자까지 마지막 문자추가 
            while(id.length() < 3)
                id += id.charAt(id.length() - 1);

        return id;
    }
	
	public static void main(String[] args) {
		Solution sol = new Solution();
		String new_id = "...!@BaT#*..y.abcdefghijklm";
		
		sol.solution(new_id);
		
	}

}
