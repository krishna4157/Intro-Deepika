import java.util.Scanner;
class AreaOfRhombus {
	public static void main(String args[]) {   
		Scanner in= new Scanner(System.in);
        System.out.println("Enter the diagonal 1:");
        float d1= in.nextFloat();
        System.out.println("Enter the diagonal 2:");
        float d2= in.nextFloat();
        float  area=(d1*d2)/2;
        System.out.println("Area of Rhombus is: " + area);      
	}
}