import java.util.ArrayList;

class Leet682 {
    public static int calPoints(String[] operations) {
        ArrayList<Integer> al = new ArrayList<>(10);
        ArrayList<Integer> al1 = new ArrayList<>();
        
        al.add(0);
        al.add(0);
        

        int count = 2;
        int count1 = 0;
        
        for (String opr : operations) {
        	try {
            if ((!opr.equals("C")) && (!opr.equals("D")) && (!opr.equals("+"))) { //Direct Scores
                int i = Integer.parseInt(opr);
                al.add(i);
                count++;
                al1.add(i);
                count1++;
            }
            else if (opr.equals("C")) {
                al.set(count-1, 0) ;
                count--; 
                if (!(count1 < 0)) {
                	al1.set(count1, 0);
                	count1--;
                }
                
            }
            else if (opr.equals("D")) {
                al.set(count, (2 * al.get(count-1)))  ;
                count++;
                al1.add(2 * al.get(count-1));
                count1++;
            }
            else if (opr.equals("+")) {
                al.set(count, (al.get(count-1) + al.get(count-2)))  ;
                count++;
                al1.add(al.get(count-1) + al.get(count-2));
                count1++;
            }
            System.out.println(al);
            
        	} catch (IndexOutOfBoundsException e) {
        		al.add(0);
        	}
        }
        int sum = 0;
        for (int i: al) {
            sum += i;
        }
        return sum;
        
    }
    
    public static void main (String [] args) {
        String [] arr = {"5","-2","4","C","D","9","+","+"};
        System.out.println(calPoints(arr));
    }
}
