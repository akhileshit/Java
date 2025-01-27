package collections10;

public class LinkedList { // LinkedList Implementation
	
	class Node { // Inner Class
		Node pl;
		Object data;
		Node nl;
	}
	
	Node first;
	int size;
	
	void add(Object e) { // 1.ADD
		Node n = new Node();
		n.pl = null;
		n.data = e;
		n.nl = null;
		
		if (first==null) {
			first = n;
			size++;
		}
		else {
			Node temp = first;
			
			while (temp.nl!=null) {
				temp = temp.nl;
			}
			temp.nl = n;
			n.pl = temp;
			size++;
			
		}
	}
	
	void remove() { // 2.REMOVE
		if (first==null) {
			System.out.println("Remove Not Possible as LL is EMPTY");
		}
		else if(first.nl==null) {
			first = null; // GC Collects it
			size--;
		}
		else {
			Node temp = first;
			
			while (temp.nl.nl!=null) {
				temp = temp.nl;
			}
			temp.nl.pl = null;
			temp.nl = null;
			size--;
		}
	}
	
	void display() { // 3.DISPLAY
		if (first==null) {
			System.out.println("LL is EMPTY");
		}
		else if (first.nl==null) {
			System.out.println(first.data);
		}
		else {
			Node temp = first;
			
			while (temp!=null) {
				System.out.print(temp.data + " ");
				temp = temp.nl;
			}
			System.out.println();
		}
	}
	
	void addFirst(Object e) { // 4.ADDFIRST
		Node n = new Node();
		n.pl = null;
		n.data = e;
		n.nl = null;
		
		if (first==null) {
			first = n;
			size++;
		}
		else {
			n.nl = first;
			first.pl = n;
			first = n;
			size++;
		}
	}
	
	void addLast(Object e) { // 5.ADDLAST
		add(e);
	}
	
	void add(int index, Object e) { // 6.ADD( , )
		if (index < 0 || index > size) {
			System.out.println("Current size of LinkedList is " + size);
			System.out.println("Enter Index Between 0 and " + size + " [inclusive]");
			return;
		} 
		
		if (index==0) {
			addFirst(e);
			return;
		}
		
		if (index==size) {
			add(e);
			return;
		}
		
		Node n = new Node();
		n.pl = null;
		n.data = e;
		n.nl = null;
		
		Node temp = first;
		for (int i=0; i<index-1; i++) {
			temp = temp.nl;
		}
		temp.nl.pl = n;
		n.nl = temp.nl;
		temp.nl = n;
		n.pl = temp;
		size++;
	}
	
	void size() { // 7.SIZE
		System.out.println(size);
	}
	
	void displayReverse() { // 8.DISPLAYREVERSE
		if (first==null) {
			System.out.println("LL is EMPTY");
		}
		else if (first.nl==null) {
			System.out.println(first.data);
		}
		else {
			Node temp = first;
			
			while (temp.nl!=null) {
				temp = temp.nl;
			}
			while (temp!=null) {
				System.out.print(temp.data + " ");
				temp = temp.pl;
			}
			System.out.println();
		}
	}
	
	void removeLast() { // 9.REMOVELAST
		remove();
	}
	
	void removeFirst() { // 10.REMOVEFIRST
		if (first==null) {
			System.out.println("Remove Not Possible. LL is EMPTY");
		}
		else if (first.nl==null) {
			first = null;
			size--;
		}
		else {
			first = first.nl;
			size--;
		}
	}
}
