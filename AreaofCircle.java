import java.util.Scanner;
class AreaofCircle {
   public static void main(String args[]) {   
	   	 Scanner in= new Scanner(System.in);
         System.out.println("Enter the radius:");
         float r= in.nextFloat();
         float  area=(22*r*r)/7 ;
         System.out.println("Area of Circle is: " + area);      
   }
}