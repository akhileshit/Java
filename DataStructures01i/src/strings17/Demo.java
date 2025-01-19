package strings17;

import java.text.SimpleDateFormat; // import
import java.util.Date; // import

public class Demo {
	public static void main(String[] args) { // Date Format
		SimpleDateFormat sdf = new SimpleDateFormat("E, MMM dd yyyy"); // Day of week, month, date, year
		SimpleDateFormat sdf1 = new SimpleDateFormat("E, dd-MM-yyyy");
		SimpleDateFormat sdf2 = new SimpleDateFormat("EEEE, MMMM dd yyyy"); // Expanded
		SimpleDateFormat sdf3 = new SimpleDateFormat("E, MMM dd yyyy, hh:mm:ss a z"); // 12hr format, am/pm, Time-Zone
		SimpleDateFormat sdf4 = new SimpleDateFormat("E, MMM dd yyyy, HH:mm:ss z"); // 24hr format
		
		
		Date today = new Date();
		
		
		System.out.println(sdf.format(today));
		System.out.println(sdf1.format(today));
		System.out.println(sdf2.format(today));
		System.out.println(sdf3.format(today));
		System.out.println(sdf4.format(today));
	}
}
