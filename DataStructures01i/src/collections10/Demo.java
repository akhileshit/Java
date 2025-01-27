package collections10;
//Don't import java.util.LinkedList

public class Demo {
	public static void main(String[] args) {
		
		LinkedList ll = new LinkedList();
		
		ll.size();
		ll.remove();
		ll.add(25);
		ll.add(250);
		ll.add("Hello");
		ll.add("LL");
		
		ll.display();
		
		System.out.println(ll);
		
		ll.remove();
		ll.display();
		
		ll.addFirst(5);
		ll.addFirst("Hello");
		ll.addFirst("LL");
		ll.display();
		
		ll.remove();
		ll.display();
		ll.size();
		
		ll.add(5,21);
		ll.display();
		ll.add(0,22);
		ll.display();
		ll.add(5,20);
		ll.display();
		ll.add(7,23);
		ll.display();
		ll.add(2,"Yaarivanu");
		ll.display();
		ll.size();
		ll.add(11,23);
		ll.add(-1,21);
		ll.size();
		ll.add(1,'Y');
		ll.display();
		ll.size();
		
		ll.displayReverse();
		
		ll.removeFirst();
		ll.display();
		ll.size();
		
		
	}
}
