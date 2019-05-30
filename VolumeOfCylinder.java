import java.util.Scanner;
class VolumeOfCylinder {
   public static void main(String args[]) {   
	   	Scanner s= new Scanner(System.in);
        System.out.println("Enter the radius:");
        float r=s.nextFloat();
        System.out.println("Enter the height:");
        float h=s.nextFloat();
        float  vol=((22*r*r*h)/7);
        System.out.println("volume of Cylinder is: " +vol);
   }
}