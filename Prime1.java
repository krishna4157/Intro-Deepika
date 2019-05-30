import java.util.Scanner;
class Prime1 {
	public static void main(String[] args) {
			int a,b;
			int count=0;
			int count2=0;
			boolean flag= false;
			System.out.println("Enter the Number :");
			Scanner in = new Scanner(System.in);
			a=in.nextInt();
			for(int i=1;i<=a;i++) {
				if(a%i==0) {
					count++;
				}
			}
	if(count==2) {	
		System.out.println("the prime number is "+a);
			for(int i=1;i<=a;i++) {
				count2=0;
				for(int j=1;j<=a;j++) {
					if(i%j==0) {
						count2++;
					}
				}
			if(count2==2) {
				System.out.println("the list of prime number is "+i);
			}
		}
	}
	else {
			System.out.println("the number is not prime");
		}
	
	}
}