import java.util.Scanner;
class AverageArray {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int b,c,d;
		float result=0;
		System.out.println("Enter the number of Integers in Array");
		int n=in.nextInt();
		float[] a =new float[n];
		for(int i=0;i<n;i++) {
			a[i]=in.nextFloat();
			//result = result+a[i]/n;
		}
		for(int i=0;i<n;i++) {
			result = result+(a[i]/n);
		}
		System.out.println("Average of Array is :"+(int)result);
	}
}
