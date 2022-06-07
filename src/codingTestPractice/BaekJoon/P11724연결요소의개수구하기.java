package codingTestPractice.BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class P11724연결요소의개수구하기 {
	static boolean visited[];
	static ArrayList<Integer> A[];
	public static void main(String[] args) throws IOException {

		/*
		 * 깊이 우선 탐색(DFS)
		 * 백준 11724 연결 요소의 개수 구하기
		 * 
		 * 문제
			방향 없는 그래프가 주어졌을 때, 연결 요소 (Connected Component)의 개수를 구하는 프로그램을 작성하시오.
			
			입력
			첫째 줄에 정점의 개수 N과 간선의 개수 M이 주어진다. (1 ≤ N ≤ 1,000, 0 ≤ M ≤ N×(N-1)/2) 둘째 줄부터 M개의 줄에 간선의 양 끝점 u와 v가 주어진다. 
			(1 ≤ u, v ≤ N, u ≠ v) 같은 간선은 한 번만 주어진다.
			
			출력
			첫째 줄에 연결 요소의 개수를 출력한다.
		 */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());		// 정점의 개수
		int m = Integer.parseInt(st.nextToken());		// 간선의 개수
		
		/* 방문 기록 저장 배열 */
		visited = new boolean[n+1];						// 0번 인덱스를 사용하지 않기 위해 n + 1 해줌
		
		/* 인접 리스트 */
		A = new ArrayList[n+1];
		
		// n이 6이라면 인접 리스트의 1번부터 6번까지 ArrayList 초기화하기
		for (int i = 1; i < n + 1; i++) {
			A[i] = new ArrayList<>();
		}
		
		// 인접 리스트의 그래프 데이터 저장하기(간선의 개수만큼 반복)
		for (int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine());
			
			int start = Integer.parseInt(st.nextToken());
			int end = Integer.parseInt(st.nextToken());
			
			// 1번이랑 2번을 연결했으면 2번이랑 1번도 연결해야 한다. (양방향)
			A[start].add(end);
			A[end].add(start);
		}
		
		// DFS 반복 횟수(count)가 연결 요소의 개수이다.
		int count = 0;
		for (int i = 1; i < n + 1; i++) {
			// 방문하지 않는 노드가 있을 때
			if (!visited[i]) {
				count++;
				DFS(i);
			}
		}
		System.out.println(count);
	}
	
	// 이미 방문한 노드는 방문하지 않는다.
	private static void DFS(int v) {
		// 현재 노드가 방문 노드일 때
		if (visited[v]) return;
		
		// 현재 노드 중 방문하지 않은 노드로 DFS 실행(재귀 함수 : FILO Stack 구조와 동일함)
		visited[v] = true;
		for (int i : A[v]) {
			if (!visited[i]) {
				DFS(i);
			}
		}
	}
	

}
