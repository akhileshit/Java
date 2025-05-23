import java.util.Scanner;

class StaticMethod01 {
   public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      System.out.println("Enter the Shape(Rectangle/Circle) to find area:");
      String shape = scan.next();
      double area;
      
      if (shape.equalsIgnoreCase("rectangle")) {
    	 System.out.println("Enter the values for length and breadth:");
         int l = scan.nextInt();
         int b = scan.nextInt();
         area = (double)AreaCalculator.rectArea(l, b);
         System.out.println("The area of the rectangle is: " + area);
      } 
      
      else if (shape.equalsIgnoreCase("circle")) {
    	 System.out.println("Enter the value of radius:");
         int r = scan.nextInt();
         area = AreaCalculator.circleArea(r);
         System.out.println("The area of the rectangle is: " + area);
      }
      
      else {
         System.out.println("Invalid input");
      }

      scan.close();
   }
}