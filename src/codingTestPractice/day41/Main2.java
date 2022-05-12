package codingTestPractice.day41;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main2 {
	static boolean visited[];
	static ArrayList<Integer>[] A;
	
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
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		visited = new boolean[n + 1];
		A = new ArrayList[n+1];
		for (int i = 1;i < n + 1; i++) {
			A[i] = new ArrayList<Integer>();
		}
		
		for (int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine());
			
			int start = Integer.parseInt(st.nextToken());
			int end = Integer.parseInt(st.nextToken());
			
			A[start].add(end);
			A[end].add(start);
		}
		int count = 0;
		for (int i = 1; i < n + 1; i++) {
			if (!visited[i]) {
				count++;
				DFS(i);
			}
		}
		System.out.println(count);
	}
	private static void DFS(int v) {
		if (visited[v]) {
			return;
		}
		visited[v] = true;
		for (int i : A[v]) {
			if (!visited[i]) {
				DFS(i);
			}
		}
	}
	

}
