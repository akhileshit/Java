import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

class Node {
	int id;
	Node next;
	Node(int id) {
		this.id = id;
	}
}


public class CircularQueue {
	
	static ArrayList<Node> al = new ArrayList<>();
	static Node head = null;
	static int size = 0;
	
	public static Node buildCircularQueue(int[] ids) {
		if (ids.length == 0) return null;
		for (int i=0; i<ids.length; i++) {
			Node node = new Node(ids[i]);
			al.add(node);
			size++;
		}
		head = al.get(0);
		Node node = head;
		for (int i=0; i<ids.length-1; i++) {
			node.next = al.get(i+1);
			node = node.next;
		}
		node.next = head;
		
		return head;
	}
	
	public static Node assignHighPriorityTask(Node head, int k) {
		if (k > size -1 || k < 0) return head;
		Node node = head;
		for (int i=0; i<k; i++) {
			node = node.next;
			head = node;
		}
		return head;
	}
	
	public static void printCircularQueue(Node head) {
		Node node = head;
		for (int i=0; i<size; i++) {
			System.out.print(node.id);
			if (i != size-1) System.out.print(",");
			node = node.next;
		}
	}
	
	public static void main(String[] args) throws FileNotFoundException {
		File file = new File("circularQueue.txt");
		Scanner sc = new Scanner(file);
		
		String[] strIds = sc.nextLine().split(",");
		int[] ids = new int[strIds.length];
		
		for (int i=0; i<strIds.length; i++) {
			ids[i] = Integer.parseInt(strIds[i]);
		}
		
//		System.out.println(size);   wrong size
		
		Node header = buildCircularQueue(ids);
		Node newHeader = assignHighPriorityTask(header, sc.nextInt());
		printCircularQueue(newHeader);
		
		sc.close();
	}
}
