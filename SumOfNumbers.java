import java.util.Scanner;

class SumOfNumbers{
	public static void main(String[] args) {
		int sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of Digits ");
		int a= sc.nextInt();
		int [] b = new int[a];
		for(int i=0;i<a;i++) {
			System.out.println("Enter a number ");	
			b[i]=sc.nextInt();
		}
		for(int i=0;i<a;i++) {
			sum=sum+b[i];	
		}
		System.out.println("Total number is : "+sum);
	}
}