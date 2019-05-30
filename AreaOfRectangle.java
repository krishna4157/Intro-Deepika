import java.util.Scanner;
class AreaOfRectangle {
   public static void main(String args[]) {   
      Scanner s= new Scanner(System.in);
      System.out.println("Enter the length:");
      float l= s.nextFloat();
      System.out.println("Enter the breadth:");
      float b= s.nextFloat();
      double  area=l*b;
      System.out.println("Area of Rectangle is: " + area);      
   }
}