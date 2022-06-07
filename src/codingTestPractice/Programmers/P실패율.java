package codingTestPractice.Programmers;

import java.util.ArrayList;
import java.util.Collections;

public class P실패율 {

	/*
	 * 실패율
	 * 
	 * 실패율은 다음과 같이 정의한다. 스테이지에 도달했으나 아직 클리어하지 못한 플레이어의 수 / 스테이지에 도달한 플레이어 수
	 * 
	 * 전체 스테이지의 개수 N, 게임을 이용하는 사용자가 현재 멈춰있는 스테이지의 번호가 담긴 배열 stages가 매개변수로 주어질 때,
	 * 실패율이 높은 스테이지부터 내림차순으로 스테이지의 번호가 담겨있는 배열을 return 하도록 solution 함수를 완성하라.
	 * 
	 * 제한사항 스테이지의 개수 N은 1 이상 500 이하의 자연수이다. stages의 길이는 1 이상 200,000 이하이다. stages에는
	 * 1 이상 N + 1 이하의 자연수가 담겨있다. 각 자연수는 사용자가 현재 도전 중인 스테이지의 번호를 나타낸다. 단, N + 1 은 마지막
	 * 스테이지(N 번째 스테이지) 까지 클리어 한 사용자를 나타낸다. 만약 실패율이 같은 스테이지가 있다면 작은 번호의 스테이지가 먼저 오도록
	 * 하면 된다. 스테이지에 도달한 유저가 없는 경우 해당 스테이지의 실패율은 0 으로 정의한다.
	 * 
	 * 입출력 예 #1 1번 스테이지에는 총 8명의 사용자가 도전했으며, 이 중 1명의 사용자가 아직 클리어하지 못했다. 따라서 1번 스테이지의
	 * 실패율은 다음과 같다.
	 * 
	 * 1 번 스테이지 실패율 : 1/8 2번 스테이지에는 총 7명의 사용자가 도전했으며, 이 중 3명의 사용자가 아직 클리어하지 못했다. 따라서
	 * 2번 스테이지의 실패율은 다음과 같다.
	 * 
	 * 2 번 스테이지 실패율 : 3/7 마찬가지로 나머지 스테이지의 실패율은 다음과 같다.
	 * 
	 * 3 번 스테이지 실패율 : 2/4 4번 스테이지 실패율 : 1/2 5번 스테이지 실패율 : 0/1 각 스테이지의 번호를 실패율의
	 * 내림차순으로 정렬하면 다음과 같다.
	 * 
	 * [3,4,2,1,5]
	 */

	public int[] solution(int N, int[] stages) {
		int[] answer = new int[N];
		double[] stage = new double[N + 1]; // 스테이지마다 머물러 있는 사용자수를 담을 배열

		// stage배열에 머물러있는 사용자수를 담는다 , 인덱스값이 스테이지번호
		for (int i : stages) {
			if (i == N + 1) {
				continue;
			}
			stage[i]++;
		}
		// 실패율을 계산해 담을 list
		ArrayList<Double> fail = new ArrayList<Double>();
		// 스테이지에 도달한 명수
		double num = stages.length;
		// 다음 스테이지로 올라갈때 줄어드는 사용자수를 계산하기 위해 사용
		double tmp = 0;
		// 실패율을 구한 후 다시 stage배열에 담고, fail 리스트에도 담아준다.
		for (int i = 1; i < stage.length; i++) {
			tmp = stage[i];
			// 도달한 사용자 수가 0 일때, 실패율도 0
			if (num == 0) {
				stage[i] = 0;
			} else {
				stage[i] = stage[i] / num;
				num = num - tmp;
			}
			fail.add(stage[i]);
		}
		// fail 리스트를 내림차순으로 정렬해준다.
		Collections.sort(fail, Collections.reverseOrder());
		// 정렬된 fail리스트 값과 stage값을 비교해서 같으면 stage의 인덱스번호(스테이지번호)를 가져옴으로써
		// 실패율이 높은 순으로 answer배열에 넣어준다.
		for (int i = 0; i < fail.size(); i++) {
			for (int j = 1; j < stage.length; j++) {
				if (fail.get(i) == stage[j]) {
					answer[i] = j;
					stage[j] = -1;
					break;
				}
			}
		}
		return answer;
	}

	public static void main(String[] args) {
		P실패율 sol = new P실패율();
		int N = 5;
		int[] stages = { 2, 1, 2, 6, 2, 4, 3, 3 };

		sol.solution(N, stages);
	}

}
