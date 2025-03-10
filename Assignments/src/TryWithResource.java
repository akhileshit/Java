import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResource { // Try-with-Resources  (Java 8 and above)
	
	public static void main(String[] args) throws IOException {
		
		FileReader reader = new FileReader("file.txt");
		BufferedReader b_reader = new BufferedReader(reader);
		
		try (reader; b_reader) { // Try with Resource (manages the cleanup/closing of specified resources(separated by ;) "Automatically" w/o any need for finally block to do it)
			
			// More code
		}
		
	}
}

// This is the only situation where only try block can be valid(try-with-Resources)
// try (resources_to_be_closed)

//More Info: https://docs.oracle.com/javase/tutorial/essential/exceptions/tryResourceClose.html