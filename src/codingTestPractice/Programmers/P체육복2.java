package codingTestPractice.Programmers;

import java.util.Arrays;

public class P체육복2 {
	
	/*
	 * 체육복
	 * 
	 * 전체 학생의 수 n, 체육복을 도난당한 학생들의 번호가 담긴 배열 lost, 여벌의 체육복을 가져온 학생들의 번호가 담긴 배열 reserve가 매개변수로 주어질 때, 
	 * 체육수업을 들을 수 있는 학생의 최댓값을 return 하도록 solution 함수를 작성해주세요.
	 * 
	 * 제한사항
		전체 학생의 수는 2명 이상 30명 이하입니다.
		체육복을 도난당한 학생의 수는 1명 이상 n명 이하이고 중복되는 번호는 없습니다.
		여벌의 체육복을 가져온 학생의 수는 1명 이상 n명 이하이고 중복되는 번호는 없습니다.
		여벌 체육복이 있는 학생만 다른 학생에게 체육복을 빌려줄 수 있습니다.
		여벌 체육복을 가져온 학생이 체육복을 도난당했을 수 있습니다. 이때 이 학생은 체육복을 하나만 도난당했다고 가정하며, 
		남은 체육복이 하나이기에 다른 학생에게는 체육복을 빌려줄 수 없습니다.
		
		입출력 예
		n	lost	reserve	return
		5	[2, 4]	[1, 3, 5]	5
		5	[2, 4]	[3]	4
		3	[3]	[1]	2
		입출력 예 설명
		예제 #1
		1번 학생이 2번 학생에게 체육복을 빌려주고, 3번 학생이나 5번 학생이 4번 학생에게 체육복을 빌려주면 학생 5명이 체육수업을 들을 수 있습니다.
		
		예제 #2
		3번 학생이 2번 학생이나 4번 학생에게 체육복을 빌려주면 학생 4명이 체육수업을 들을 수 있습니다.
	 */
	
	public int solution(int n, int[] lost, int[] reserve) {
//         int answer = n - lost.length;
        
//         Arrays.sort(lost);
//         Arrays.sort(reserve);
        
//         // 여벌 체육복을 가져온 학생이 도난당한 경우
//         for(int i=0; i<lost.length; i++){
//             for(int j=0; j<reserve.length; j++){
//                 if(lost[i] == reserve[j]){
//                     answer++;
//                     lost[i] = -1;
//                     reserve[j] = -1; 
//                     break; 
//                 }
//             }
//         }
//         // 도난당한 학생에게 체육복 빌려주는 경우
//         for(int i=0; i<lost.length; i++){
//             for(int j=0; j<reserve.length; j++){
//                 if((lost[i]-1 == reserve[j]) || (lost[i]+1 == reserve[j])){
//                     answer++;
//                     reserve[j] = -1; 
//                     break; 
//                 }
//             }
//         }
	int answer = n;
        int []student = new int[n];
        
        Arrays.fill(student, 1);
        for (int i : lost)
            student[i - 1] -= 1;
        for (int i : reserve)
            student[i - 1] += 1;
        for (int i = 0; i < student.length; i++) {
            if (student[i] == 0) {
                if (i > 0 && student[i - 1] == 2) //왼쪽 검사
                    student[i - 1] -= 1;
                else if (i < n - 1 && student[i + 1] == 2)
                    student[i + 1] -= 1;
                else
                    answer--;
            }
        }
		
        return answer;
    }
	
	public static void main(String[] args) {
		P체육복2 sol = new P체육복2();
		int n = 5;
		int[] lost = {2, 4};
		int[] reverse = {1, 3, 5};
		
		sol.solution(n, lost, reverse);
	}

}
