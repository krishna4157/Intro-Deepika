import java.util.Scanner;	
class VolumeOfCone {
   public static void main(String args[]) {   
            Scanner s= new Scanner(System.in);
         	System.out.println("Enter the radius of cone:");
         	float r=s.nextFloat();
         	System.out.println("Enter the height of cone:");
         	float h=s.nextFloat();
         	float vol=(22*r*r*h)/(3*7);
         	System.out.println("Volume Of Cone is:" +vol);          
   }
}