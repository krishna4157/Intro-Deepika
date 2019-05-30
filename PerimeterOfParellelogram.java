import java.util.Scanner;
class PerimeterOfParallelogram{
   public static void main(String args[]) {   
         Scanner s= new Scanner(System.in);
         System.out.println("Enter the height of the Parallelogram:");
         float h= s.nextFloat();
         System.out.println("Enter the breadth of the Parallelogram:");
         float b= s.nextFloat();
         float  perimeter=2*(h+b);
         System.out.println("perimeter of Parallelogram is: " + perimeter);      
   }
}