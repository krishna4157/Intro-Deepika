import java.util.Scanner;
class AreaOfequilateralTriangle {
	public static void main(String args[]) {      
          Scanner s= new Scanner(System.in);
          System.out.println("length of side of the Triangle:");
          float a= s.nextFloat();
          double  area=(Math.sqrt(3)/4)*(a*a);
          System.out.println("Area of Equilateral Triangle is: " + area);      
   }
}