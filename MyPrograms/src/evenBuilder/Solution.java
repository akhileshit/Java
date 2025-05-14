package evenBuilder;

import java.util.*;

class Solution {
    public static int lengthOfLongestSubstring(String s) {
        int count = 0;
        int maxCount = 0;
        TreeSet<Character> ts = new TreeSet<>();
        HashMap<Integer, String> hs = new HashMap<>();
        StringBuilder sb = new StringBuilder();
        
        char[] chars = s.toCharArray();
        for (char c : chars) {
        	System.out.println(c);
            if (!(ts.contains(c))){
                ts.add(c);
                count++;
                sb.append(c);
            }
            else {
                hs.put(count, sb.toString());
                ts.removeAll(ts);
                sb.setLength(0);
                count = 0;
                ts.add(c);
                count++;
            }
            if (maxCount < count)  maxCount = count;
        }

        System.out.println(hs);
        return maxCount;

    }
    
    
    public static void main(String[] args) {
		
    	System.out.println(lengthOfLongestSubstring(" ")) ;
    	
	}
}