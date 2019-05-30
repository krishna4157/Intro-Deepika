import java.util.Scanner;
class PerimeterOfEquilateralTriangle {
   public static void main(String args[]) {   
         Scanner s= new Scanner(System.in);
         System.out.println("Enter the side of the Triangle:");
         float a= s.nextFloat();
         float  perimeter=3*a;
         System.out.println("perimeter of Triangle is: " + perimeter);      
   }
}