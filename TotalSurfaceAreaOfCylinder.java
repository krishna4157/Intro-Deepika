import java.util.Scanner;
class TotalSurfaceAreaOfCylinder {
   public static void main(String args[]) {   
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the radius:");
		float r=s.nextFloat();
		System.out.println("Enter the height:");
		float h=s.nextFloat();
		float  tsa=((2*22*r)/7)*(r+h);
		System.out.println("TotalSurfaceArea Of Cylinder is:  " + tsa);
   }
}