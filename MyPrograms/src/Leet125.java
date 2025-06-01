import java.util.Arrays;

public class Leet125 {
	public static boolean isPalindrome(String s) {

        if (s.length() == 1)  return true;
        StringBuilder sb = new StringBuilder();
        for (int i=0; i<s.length(); i++) {
            if ( ((int)s.charAt(i) >= 65 && (int)s.charAt(i) <= 90) || ((int)s.charAt(i) >= 97 && (int)s.charAt(i) <= 122) || ((int)s.charAt(i) >= 48 && (int)s.charAt(i) <= 57)) {
                sb.append(s.charAt(i));
            }
        }

        String s1 = sb.toString(); 
        String s2 = sb.reverse().toString(); 
        char[] c1 = s1.toCharArray();
        Arrays.sort(c1);
        System.out.println(s1);
        System.out.println(s2);

        if (s1.equalsIgnoreCase(s2))  return true; 
        else  return false;
    }
    
    public static void main (String[] args) {
    	System.out.println(isPalindrome("0P")); 
    }
}


