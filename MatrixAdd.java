import java.util.Scanner;
class MatrixAdd{
	public static void main(String args[]){
		int m,n;
		Scanner in = new Scanner(System.in);
		m=in.nextInt();
		n=in.nextInt();
		int a[][] = new int[m][n];
		int b[][] =new int[m][n];
		int c[][] = new int[m][n];
		System.out.println("Enter first Matrix");
		for(int i=0;i<m;i++){
			for(int j=0;j<n;j++) {
			a[m][n]=in.nextInt();
			}
		}
		System.out.println("Enter second Matrix");
		for(int i=0;i<m;i++){
			for(int j=0;j<n;j++) {
				b[m][n]=in.nextInt();
			}
		}
		System.out.println("Addition of matrices is");
		for(int i=0;i<m;i++){
			for(int j=0;j<n;j++)
			c[m][n]=a[m][n]+b[m][n];
			System.out.println(c[m][n] +"  ");
		}
	}
}