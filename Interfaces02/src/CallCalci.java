
public class CallCalci {
	public static void acceptCalci(Calculator ref) { // To achieve polymorphism and code compactness
		ref.takeInput();
		ref.add();
		ref.sub();
		ref.mul();
		ref.div();
		ref.mod();
	}
}
