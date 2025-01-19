class Kod {

	public static void main(String [] args) {
		
		System.out.println("Hello" + " " +  args[0] + " " + args[1]);

		for (String x : args) 
			System.out.println(x);
	}
}