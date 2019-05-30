import java.util.Scanner;
class FutureInvestment{
		public static void main(String args[]){
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter present value: ");
	        int p=sc.nextInt();
	        System.out.print("Interest rate: ");
	        int r=sc.nextInt();
	        System.out.print("Enter time period years: ");
	        int y=sc.nextInt();
	        double f=p*Math.pow(((1+r)/100),y);
	        System.out.print("value is: "+f);
		}
}