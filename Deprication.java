import java.util.Scanner;
class Deprecation{
	public static void main(String arg[]){
		float amount,deppercent,year,afterdep,temp;
		Scanner sc=new Scanner(System.in);
		System.out.println("amount");
		amount=sc.nextFloat();
		System.out.println("Depreciation percentage");
		deppercent=sc.nextFloat();
		System.out.println("number of years");
		year=sc.nextFloat();
		temp=amount;
		for(int i=0;i<year;i++) {
			temp=((100-deppercent)*temp)/100;
		}
		System.out.println("depreciation = "+temp);
	}
}