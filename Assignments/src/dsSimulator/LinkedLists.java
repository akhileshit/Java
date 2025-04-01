package dsSimulator;

public class LinkedLists {
	
	class Node {
		Node left;
		Object data;
		Node right;
	}
	
	int size;
	Node first;
	Node curr;
	Node prev;
	Node temp;
	
	public void add(int pos, Object o) {
		curr = new Node();
		if (size == 0) { 
			curr.data = o;
			curr.left = null;
			curr.right = null;
			first = curr;
			prev = curr;
			size++;
		}
		else if (pos == 0) { // 1st pos
			curr.data=o;
			curr.left=null;
			curr.right=first;
			first = curr;
			size++;
		}
		
		else if (pos == size-1){ // last pos
			curr.data = o;
			curr.left = prev;
			curr.right = null;
			size++;
		}
	}
}
