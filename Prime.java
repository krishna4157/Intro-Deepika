import java.util.Scanner;
class Prime{
	public static void main(String [] args) {
	    System.out.println("Enter Number to Check if Prime Number or Not ");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		boolean flag = false;
		for(int i=1;i<=n;i++) {
		   if(n%i==0){
		        flag=true;	        
		   }
		}
		if(flag==true){
		       	System.out.println("Entered number is a Prime number ");
		} else {
				System.out.println("Entered number is not a Prime Number");        
		} 	
	}
}