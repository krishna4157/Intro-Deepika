import java.util.Scanner;
class AreaOfIsoclesTriangle {
	public static void main(String args[]) {   
         Scanner s= new Scanner(System.in);
         System.out.println("Enter the length of same sided");
         float a= s.nextFloat();
         System.out.println("Enter the side2 of the Triangle");
         float b= s.nextFloat();
         Double area=(b/4)*Math.sqrt((4*a*a)-(b*b));
         System.out.println("Area of Isosceles Triangle is: " + area);
	}
}