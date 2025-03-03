
import java.io.IOException;

public class CheckedAndUncheckedExc {
    public static void main(String[] args) {
        try {
            readFile();  // Method should declare 'throws'
        } catch (IOException e) {
            System.out.println("Caught IOException: " + e.getMessage());
        }
        
        
        try {
        	divide();  // Method no need to declare 'throws'
        } catch (ArithmeticException e) {
        	System.out.println("Caught ArithmeticException: " + e.getMessage());
        }
    }


    public static void readFile() throws IOException{ // Checked Exception
        throw new IOException("File not found.");  // This will cause a compilation error if "throws IOException" not written
    }
    
    public static void divide() { // Unchecked Exception
    	throw new ArithmeticException("/ by 0 not possible.");  // This wont cause a compilation error
    }
}