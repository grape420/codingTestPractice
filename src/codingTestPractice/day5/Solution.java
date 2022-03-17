package codingTestPractice.day5;

import java.util.Arrays;

class Solution {
//    public int[] solution(int[] array, int[][] commands) {
//        int[] answer = new int[commands.length];
//        
//        for(int i = 0; i < commands.length; i++) {
//        	List<Integer> arrInt = new ArrayList<Integer>();
//        	for (int j = commands[i][0] - 1; j < commands[i][1]; j++) {
//        		arrInt.add(array[j]);
//        	}
//        	Collections.sort(arrInt);
//        	answer[i] = arrInt.get(commands[i][2] - 1);
//        }
//        return answer;
//    }
	public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        for(int i=0; i<commands.length; i++){
            int[] temp = Arrays.copyOfRange(array, commands[i][0]-1, commands[i][1]);
            Arrays.sort(temp);
            answer[i] = temp[commands[i][2]-1];
        }

        return answer;
    }
}
