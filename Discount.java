import java.util.Scanner;
public class Discount {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("enter Cost :");
		int a=in.nextInt();
		System.out.println("enter Discount :");
		int b=in.nextInt();
		int dis = a*b/100;
		int result = a-dis;
		System.out.println("The Discounted Price is :"+result);
	}
}
