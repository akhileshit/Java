package DecodingMain;

public class Kod { // args array inside main

	public static void main(String [] args) {
		
		System.out.println("Hello" + " " +  args[0] + " " + args[1]);

		for (String x : args) 
			System.out.println(x);
	}
}

// use "Integer.parseInt(args[1]);".. to convert any string to integer