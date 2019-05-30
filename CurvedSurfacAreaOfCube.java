import java.util.Scanner;
class CurvedSurfaceAreaOfCube {
   public static void main(String args[]) {   
         Scanner in= new Scanner(System.in);
         System.out.println("Enter the side of cube:");
         float side=in.nextFloat();
         float  v=4*side*side;
         System.out.println("CurvedSurfaceArea Of Cube is:" +v);        
   }
}