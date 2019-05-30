import java.util.Scanner;
class PerimeterOfRhombus{
   public static void main(String args[]) {   
      	 Scanner s= new Scanner(System.in);
         System.out.println("Enter the side of the Rhombus:");
         float s1= s.nextFloat();
         float  perimeter=4*s1;
         System.out.println("perimeter of Rhombus is: " + perimeter);      
   }
}