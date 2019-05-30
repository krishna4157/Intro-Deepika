import java.util.Scanner;
class ReverseInt {
	public static void main(String[] args) {
		int a;
		final int b;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter Number to Check Whether it is Palindrome or Not");
		a=in.nextInt();
		int temp=0;
		b=a;
		while(a!=0){
			temp=temp*10;
			temp=temp+a%10;
			a=a/10;
		}
		//c=temp;
		System.out.println("the reverse of number is "+temp);
		if(temp==b) {
			System.out.println("The Entered Number is a Palindrome");
		}
		else
			System.out.println("The Entered Number is not a Palindrome");
	}
}
