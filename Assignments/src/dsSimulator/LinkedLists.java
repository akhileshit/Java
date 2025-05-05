package dsSimulator;

public class LinkedLists {
	
	class Node {
		Node prev;
		Object data;
		Node next;
	}
	
	Node first = null;
	Node last = null;
	int size = 0;
	
	
	void add(Object data, int pos) {
		Node node = new Node();
		
		if (pos <= 0 || pos > size+1) { //Invalid position
			if (size == 0) {}
			else {
				System.err.println("ENTER A VALID POSITION TO ADD.");
				return;
			}
		}
		if (size == 0) { //Adding 1st node
			first = node;
			first.data = data;
			last = first;
			size++;
		}
		else if (size >= 1 && pos == 1) { //AddFirst
			node.next = first;
			node.next.prev = node;
			node.data = data;
			first = node;
			size++;
		}
		else if (size >= 1 && pos == size+1) { //AddLast
			node.prev = last;
			node.prev.next = node;
			node.data = data;
			last = node;
			size++;
		}
		else { //Add in between
			Node temp = first;
			for (int i=1; i<pos-1; i++) { //Traverse to targetBut1 node
				temp = temp.next;
			}
			
			temp.next.prev = node;
			node.next = temp.next;
			temp.next = node;
			temp.next.prev = temp;
			size++;
		}
	}
	
	
	void delete(int pos) {
		
		if (pos <= 0 || pos > size) { //Invalid position
			if (size == 0) { //No node
				System.out.println("NOTHING TO DELETE. THE LIST IS EMPTY.");
				return;
			}
			else {
				System.err.println("ENTER A VALID POSITION TO DELETE.");
				return;
			}
		}
		if ((pos == 1 || pos == size) && size == 1) { //Delete the only 1st/last node
			first = null;
			last = null;
			size--;
		}
		else if (pos == 1 && size > 1) { //DeleteFirst
			Node temp = first.next;
			first.next.prev = null;
			first.next = null;
			first = temp;
			size--;
		}
		else if (pos == size && size > 1) { //DeleteLast
			Node temp = last.prev;
			last.prev.next = null;
			last.prev = null;
			last = temp;
			size--;
		}
		else { //Delete in between
			Node temp = first;
			for (int i=1; i<pos-1; i++) { //Traverse to targetBut1 node
				temp = temp.next;
			}
			
			Node temp1 = temp.next.prev;
			Node temp2 = temp.next.next;
			temp.next.next = null;
			temp.next.prev = null;
			temp.next = temp2;
			temp.next.prev = temp1;
			size--;
		}
	}
	
	
	void update(int pos, Object data) {
		
		if (pos <= 0 || pos > size) { //Invalid position
			if (size == 0)  {
				System.out.println("CANNOT UPDATE. THE LIST IS EMPTY.");
				return;
			}
			else {
				System.err.println("ENTER A VALID POSITION TO UPDATE.");
				return;
			}
		}
		
		if (pos == 1)  first.data = data; //1st node
		else if (pos == size)  last.data = data; //Last node
		
		else { //In between
			Node temp = first;
			for (int i=1; i<pos; i++) { //Traverse to target node
				temp = temp.next;
			}
			temp.data = data;
		}
	}
	
	
	void display() {
		
		if (size == 0)  System.out.println("LINKED LIST IS EMPTY.");
		else {
			Node temp = first;
			System.out.println("LIST DISPLAY: ");
			System.out.println(temp.data);
			for (int i=1; i<size; i++) { //Traverse to target node
				temp = temp.next;
				System.out.println(temp.data);
			}
		}
	}
	
	
	
	
	public static void main(String[] args) {
		
		LinkedLists dll = new LinkedLists();
//		dll.display();
//		dll.delete(0);
		dll.add(86, 1);
		dll.add("Henry", 2);
		dll.add(2.5, 3);
		
		dll.delete(22);
		dll.display();
//		dll.update(-5, 86);
	}
}
