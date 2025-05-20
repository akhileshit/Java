
public class Leet88 {
	public void merge(int[] nums1, int m, int[] nums2, int n) {
        // no need to handle when n=0

        int resume = 0;
        for (int i=0; i<n; i++) {  //n
            for (int j=resume; j<m+n; j++) { //m+n
                if (nums1[j] == 0) {
                    nums1[j] = nums2[i];
                    resume = j+1; //becaz nxt no. is always >=  this
                    break;  //break since placed
                }
                if(nums1[j] < nums2[i]) {
                    if (nums1[j+1] == 0) {
                        nums1[j+1] = nums2[i];
                        resume = j+2; //becaz nxt no. is always >=  this
                        break;  //break since placed
                    }
                    int temp = nums1[j+1];
                    nums1[j+1] = nums2[i];
                    resume = j+2; //becaz nxt no. is always > than this
                    int count= j+1;
                    while(nums1[count] != 0) {
                        count++;
                    }
                    nums1[count] = temp;
                    break;  //break since placed
                }
                else {
                	
                }
            }
        }
    }
}
