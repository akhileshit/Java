
public class CheckExec { // To check weather this, this(), super, super() can be inside a method
	// CONCLUSION: this() or super() only possible inside constructors, that too only as 1st line
	public static void main(String[] args) {
		CheckChild c = new CheckChild();
		c.forThisKey();
		c.forSuperKey(); 
	}
}
