import java.util.Scanner;
class VolumeOfSphere {
   public static void main(String args[]) {   
            Scanner in= new Scanner(System.in);
         	System.out.println("Enter the radius of sphere:");
         	float r=in.nextFloat();
            float  vol= (4*22*r*r*r)/(3*7);
            System.out.println("Volume is: " +vol);
   }
}