import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

class InvalidPriceException extends Exception {
	public InvalidPriceException(String message) {
		super(message);
	}
}

public class MembershipBasedBill {
	public static void main(String[] args) {
		try {
		File file = new File("membership_bill_file.txt");
		Scanner sc = new Scanner(file);
		
		int n = sc.nextInt();
		sc.nextLine();
		
		Map<String, Double> bills = new TreeMap<>();
		
		for (int i=0; i<n; i++) {
			String[] customerDetails = sc.nextLine().split(" ");
			String customerName = customerDetails[0];
			String membership = customerDetails[1];
			int itemsCount = Integer.parseInt(customerDetails[2]);
			
			double totalPrice = 0.0;
			for (int j=0; j<itemsCount; j++) {
				String[] itemDetails = sc.nextLine().split(" ");
				String itemName = itemDetails[0];
				double itemPrice = Integer.parseInt(itemDetails[1]);
				
				if (itemPrice < 0) {
					throw new InvalidPriceException("Invalid price found for customer " + customerName + ": " + itemPrice);
				}
				
				totalPrice += itemPrice;
			}
			double totalPriceBefore = totalPrice;
			
			switch (membership) {
			case "Regular" -> totalPrice *= 0.95;
			case "Gold" -> totalPrice *= 0.9;
			case "Platinum" -> totalPrice *= 0.8;
			}
			
			if (totalPriceBefore > 1000.0) {
				totalPrice -= 50;
			}
			
			bills.put(customerName, totalPrice);
		}
		for (Map.Entry<String, Double> bill: bills.entrySet()) {
			System.out.printf("%s: ₹%.2f\n", bill.getKey(), bill.getValue());
		}
		
		} catch (InvalidPriceException e) {
			System.out.println(e.getMessage());;
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());;
		}
	}
}

