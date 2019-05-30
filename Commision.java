import java.util.Scanner;
class CalculateCommission{
	public static void main(String arg[]){
			Scanner sc=new Scanner(System.in);
	  		System.out.print("Enter amount:");
	  		float amount=sc.nextFloat();
	  		System.out.print("Enter commissionPercentage:");
	  		float commissionPercentage=sc.nextFloat();
	  		float commission=(commissionPercentage/100)*amount;  	   
	  		System.out.println("Commission amount="+commission);
	}
}