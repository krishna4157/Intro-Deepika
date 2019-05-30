import java.util.Scanner;
public class InsertinginArray {
	public static void main(String[] args) {
		int B,C,D,pos,x;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter Number of Elements in Array");
		B=in.nextInt();
		int a[] =new int[B+1];
		System.out.println("Enter Elements in Array ");
		for(int i=0;i<B;i++) {
			a[i]=in.nextInt();
		}
		System.out.println("Enter position of element to insert");
		pos=in.nextInt();
		System.out.println("Enter element to insert");
		x=in.nextInt();
		for(int i=(B-1);i>=(pos-1);i--) {
			a[i+1]=a[i];
		}
		a[pos-1]=x;
		System.out.println("The Array After Inserting Elements are: ");
		for(int i=0;i<B;i++) {
			System.out.print(a[i]+",");
		}
		System.out.print(a[B]);
	}
}
