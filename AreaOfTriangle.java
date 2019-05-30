import java.util.Scanner;
class AreaOfTriangle {
   public static void main(String args[]) {   
	   	Scanner s= new Scanner(System.in);
        System.out.println("Width of the Triangle:");
        float w= s.nextFloat();
        System.out.println("Height of the Triangle:");
        float h= s.nextFloat();
        float area=(w*h)/2;
        System.out.println("Area of Triangle is: " + area);      
   }
}