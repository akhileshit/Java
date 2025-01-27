package collections14;

import java.util.Stack; //import

public class Demo { // Stack (LEGACY Class)

	public static void main(String[] args) {
		Stack st = new Stack();
		
		st.add(17);
		st.add(15);
		st.push(12);
		st.push("Hello Stack");
		st.push("Legacy");
		System.out.println(st);
		
		st.pop();
		System.out.println(st);
		st.pop();
		System.out.println(st);
		
		st.clear();
		System.out.println(st);

	}

}
