
public class Arrays16 { // Find unique elements in an array(SORTED)
	public static void main(String[] args) {
		int[] arr = {1,1,2,2,5,-3,-3,4};
		//int[] arr = {1,1,4}; //arr.length = 3
		
		int i=0, count=1, track=0;
		while (i<arr.length) { //0,1
			
			if (i==arr.length-1) { // for last element
				if (arr.length==1 || arr[i] != arr[i-1]) { // for array length=1 or last index unique element
					System.out.println(arr[i]); track++;
					System.exit(0);
				}
			}
			while(i<arr.length-1 && arr[i] == arr[i+1]) { // for index 0 to arr.length-1
				count++; //2
				i++; //1
			}
			if (count==1 && arr[i] != arr[i-1]) { // for unique elements
				System.out.println(arr[i]); track++;
			}
			count = 1;
			i++;
		}
		if(track==0) // No unique element
			System.out.println("Maybe nothing unique here!");
	}
}
