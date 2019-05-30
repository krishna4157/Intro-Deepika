import java.util.Scanner;
class Factorial {
	public static void main(String arg[]) {
	    int fact=1;
	    int n;
	    System.out.println("Enter the Number");
	    Scanner in = new Scanner(System.in);
	    n=in.nextInt();
			for(int i=1;i<=n;i++) { 
		    	   fact=fact*i;
			}
	 	   	System.out.println("factoral is = "+fact);
	}
}