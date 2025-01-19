package strings06;

public class Demo { // some other String methods
	public static void main(String[] args) {
		String s = "Jyothi Gas Agency Pvt Ltd";
		String s1 = "";
		String s2 = " ";
		
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());
		System.out.println(s.contains("Gas"));
		System.out.println(s.concat(" is The Best"));
		System.out.println(s.substring(14));
		System.out.println(s.substring(12, 18)); // last index -1 
		System.out.println(s.length());
		System.out.println(s.startsWith("Jyo"));
		System.out.println(s.startsWith("ltd"));
		System.out.println(s.indexOf("A"));
		System.out.println(s.indexOf("Age"));
		System.out.println(s.isEmpty());
		System.out.println(s1.isEmpty());
		System.out.println(s2.isEmpty());
		System.out.println(s.lastIndexOf("a"));
		System.out.println(s.charAt(22));
		System.out.println(s.replace('a' ,'A'));
		System.out.println(s.replaceAll("Pvt" ,"Private"));
	}
}
