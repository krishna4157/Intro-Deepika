import java.util.Scanner;
class PerimeterOfSquare{
   public static void main(String args[]) {   
         Scanner s= new Scanner(System.in);
         System.out.println("Input side of the square:");
         float a= s.nextFloat();
         float perimeter=4*a;
         System.out.println("Perimeter of the Square is: " + perimeter);      
   }
}