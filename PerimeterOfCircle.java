import java.util.Scanner;
class PerimeterOfCircle {
   public static void main(String args[]) {   
     	 Scanner s= new Scanner(System.in);        
         System.out.println("enter the radius:");
         float r= s.nextFloat();
         float  c=(22*2*r)/7 ; 
         System.out.println("Perimeter of Circle is: " +c);      
   }
}