package codingTestPractice.etc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class P음료수얼려먹기 {
	static boolean visited[];
	static ArrayList<ArrayList<Integer>> list;
	public static void main(String[] args) throws IOException {

		/*
		 * 이것이 코딩테스트다 음료수 얼려 먹기
		 */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("입력 : ");
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		visited = new boolean[n + 1];
		list = new ArrayList<ArrayList<Integer>>();
		
		for (int i = 1; i <= n; i++) {
			st = new StringTokenizer(br.readLine());
			ArrayList<Integer> arrList = new ArrayList<Integer>();
			arrList.add(Integer.parseInt(st.nextToken()));
			
			Integer.parseInt(st.nextToken());
			list.add(arrList);
		}
		System.out.println(list);
		
		
	}

}
