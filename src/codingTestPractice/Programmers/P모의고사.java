package codingTestPractice.Programmers;

import java.util.ArrayList;
import java.util.List;

public class P모의고사 {
	
	/*
	 * 모의고사
	 * 
	 * 수포자는 수학을 포기한 사람의 준말입니다. 수포자 삼인방은 모의고사에 수학 문제를 전부 찍으려 합니다. 수포자는 1번 문제부터 마지막 문제까지 다음과 같이 찍습니다.

		1번 수포자가 찍는 방식: 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, ...
		2번 수포자가 찍는 방식: 2, 1, 2, 3, 2, 4, 2, 5, 2, 1, 2, 3, 2, 4, 2, 5, ...
		3번 수포자가 찍는 방식: 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, ...

		1번 문제부터 마지막 문제까지의 정답이 순서대로 들은 배열 answers가 주어졌을 때, 
		가장 많은 문제를 맞힌 사람이 누구인지 배열에 담아 return 하도록 solution 함수를 작성해주세요.

		제한조건
		시험은 최대 10,000 문제로 구성되어있습니다.
		문제의 정답은 1, 2, 3, 4, 5중 하나입니다.
		가장 높은 점수를 받은 사람이 여럿일 경우, return하는 값을 오름차순 정렬해주세요.
	 */

	public int[] solution(int[] answers) {
        int[] answer = {};
        int[] supo1 = {1, 2, 3, 4, 5};
        int[] supo2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] supo3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int answer1 = 0, answer2 = 0, answer3 = 0;
        
        for (int i = 0; i < answers.length; i++) {
        	if (supo1[i % supo1.length] == answers[i]) answer1++;
        	if (supo2[i % supo2.length] == answers[i]) answer2++;
        	if (supo3[i % supo3.length] == answers[i]) answer3++;
        }
        
        int max = Math.max(Math.max(answer1, answer2), answer3);
        
        List<Integer> list = new ArrayList<>();
        if (max == answer1) list.add(1);
        if (max == answer2) list.add(2);
        if (max == answer3) list.add(3);
        
        answer = new int[list.size()];
        
        for (int i = 0; i < answer.length; i++) {
        	answer[i] = list.get(i);
        }
        
        return answer;
    }
	
	public static void main(String[] args) {
		P모의고사 sol = new P모의고사();
		int[] answers = {1, 3, 2, 4, 2};
		
		sol.solution(answers);
	}
}
