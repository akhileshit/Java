import java.util.Scanner;

public class Arrays10 { // Leet-code 27th problem "Remove Element"      // Has bugs........
	public int removeElement(int[] nums, int val) {
        int count = 0;
        for (int i=0; i<nums.length; i++) {
            
        	if(nums[i] == val) {
                int j=i;
                while((nums[j] == val) && j < nums.length-1) {
                    j++;
                    if (nums[j] == val && j==nums.length-1) {
                        break;
                    }
                }
                nums[i] = nums[j];
                nums[j] = val;
                count++;
            }
            else {
                count++;
            }
        }
        
        return count;
    }
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] arr = new int[4];
		System.out.println("Enter " + arr.length + " elements:");
		for (int i=0; i<arr.length; i++ ) {
			arr[i] = scan.nextInt();
		}
		scan.close();
		
		int count = new Arrays10().removeElement(arr, 3);
		System.out.println("Count = " + count);
	}
}
