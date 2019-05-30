import java.util.Scanner;
class VolumeOfPrism {
   public static void main(String args[]) {   
	   	 Scanner s= new Scanner(System.in);
         System.out.println("Enter the area of base:");
         float b=s.nextFloat();
         System.out.println("Enter the height:");
         float h=s.nextFloat();
         float  area=b*h ;
         System.out.println("Volume Of Prism is: " + area);      
   }
}