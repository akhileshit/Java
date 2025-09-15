import java.util.ArrayList;
import java.util.Scanner;

public class WeightStoner {
	public static void main(String[] args) {
		
		ArrayList<Integer> weights = new ArrayList<>();
		weights.add(1000);
		weights.add(500);
		weights.add(100);
		weights.add(50);
		weights.add(20);
		weights.add(10);
		weights.add(2);
		weights.add(1);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the weight: ");
		int w = sc.nextInt();
		
		ArrayList<Integer> output = new ArrayList<>();
		int sum = 0;
		for (int weight: weights) {
			if (w > weight) {
				while (true) {
					if (sum < w) {
						output.add(weight);
						sum = 0;
						for (int i: output) {
							sum += i;
						}
					}
					else if (sum > w) {
						if (output.size() != 0) {
							output.removeLast();
							sum = 0;
							for (int i: output) {
								sum += i;
							}
						}
						break;
					}
					else {
						System.out.println(output);
						System.out.println(output.size());
						return;
					}
				}
			}
		}
		
	}
	
}
