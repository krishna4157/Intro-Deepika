import java.util.Scanner;
public class DecimaltoBinary {
public static void main(String[] args) {
	int a,b;
	int arr[] =new int[20];
	int j=0;
	int count=0;
	Scanner in = new Scanner(System.in);
	System.out.println("Enter the Number to convert");
	a=in.nextInt();
		while(a!=0) {
			arr[j]=a%2;
			a=a/2;
			j++;
			count++;
		}
		for(int i=count-1;i>=0;i--) {
			System.out.println(arr[i]);
		}
		//System.out.println("1");
	//int arr[]=new int[100];
	
}
}
