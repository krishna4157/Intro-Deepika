import java.util.Scanner;

public class GCD {
	public static void main(String args[]) {
		int a, b, x, y;
		int gcd=0;
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter Two Number : ");
		x = scan.nextInt();
		y = scan.nextInt();
		for(int i = 1; i <= x && i <=y; i++){
         if(x%i==0 && y%i==0)
             gcd = i;
		}
	 System.out.println("GCD of "+x+" and "+y+" is: "+gcd);
	}
}

