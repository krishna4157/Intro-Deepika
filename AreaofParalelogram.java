import java.util.Scanner;
class Area0fParalelogram {
   public static void main(String args[]) {   
	   	 Scanner s= new Scanner(System.in);
         System.out.println("Enter the height:");
         float d1= s.nextFloat();
         System.out.println("Enter the breadth:");
         float d2= s.nextFloat();
         float  area=(d1*d2) ;
         System.out.println("Area of Parallelogram is: " + area);      
   }
}