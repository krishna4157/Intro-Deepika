import java.util.Scanner;
class CompoundInterest{
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		double amount;
		double ci;
		//principle=1000,rate=10,time=3,ci;			
		System.out.println("principle= ");
		float principle=in.nextFloat();
		System.out.println("rate=");
		float rate=in.nextFloat();
		System.out.println("time=");
		float time=in.nextFloat();
		amount=principle*(Math.pow((1+rate/100),3));
		System.out.println("amount="+amount);
		ci=amount-principle;
		System.out.println("compound interest="+ci);
	}
}