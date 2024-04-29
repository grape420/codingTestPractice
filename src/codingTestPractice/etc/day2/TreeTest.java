package codingTestPractice.etc.day2;

class Tree{
	class Node{
		int data;
		Node left;	//왼쪽 노드 저장 변수
		Node right;	//오른쪽 노드 저장 변수
		Node (int data){
			this.data = data;
		}
	}
	
	//Tree class의 멤버변수 (시작점 root Node 변수
	Node root;
	
	//재귀호출에 필요한 데이터를 처음으로 지정 
	//재귀호출이 끝나면 root 노드의 주소를 받아서 멤버변수에 저장
	public void makeTree(int [] a) {
		root = makeTreeR(a, 0, a.length-1);
	}
	
	public Node makeTreeR(int [] a, int start, int end) {
		//재귀호출을 마치고 null을 반환하라 (끝나는 시점을 명시)
		if(start > end) return null;
		int mid = (start + end) / 2; 	//중간점
		// 노드 지정
		Node node = new Node(a[mid]);
		node.left = makeTreeR(a, start, mid-1);
		node.right = makeTreeR(a, mid+1, end);
		return node;
	}
	
	//트리가 잘 만들어졌는지 이진검색 함수로 확인
	public void searchBTree (Node n, int find) {
		//찾아야하는 값이 현재노드의 데이터(n.data)보다 작은지 비교
		if (find < n.data) {
			System.out.println("Data is smaller than " + n.data);
			//찾는 값이 더 작으니까 왼쪽노드의 주소를 넘기고, 찾는 값을 넘김 (반복 호출)
			searchBTree(n.left, find);
		}else if (find > n.data) {
			System.out.println("Data is bigger than " + n.data);
			//찾는 값이 더 크니까 오른쪽노드의 주소를 넘기고, 찾는 값을 넘김 (반복 호출)
			searchBTree(n.right, find);
		}else {
			System.out.println("Data Found!");
		}
	}
}
public class TreeTest {
	public static void main(String[] args) {
		int [] a = new int [10];
		for(int i=0;i<10;i++) {
			a[i] = i;
		}
		
		Tree t = new Tree();
		//해당 배열로 트리 만들고, 멤버변수 root에 저장
		t.makeTree(a);
		//검색을 시작할 위치 (t.root), 찾는 값 지정
		t.searchBTree(t.root, 6);
	}
}