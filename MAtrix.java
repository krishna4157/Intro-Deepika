import java.util.Scanner;
class MAtrix {
	int i,j;
	public static void addition(int m,int n,int a[][],int b[][]) {
		int c[][] = new int [m][n];
	  	for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++){
				c[i][j]=a[i][j]+b[i][j];
			}
		}
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++){
				System.out.print(c[i][j]+"  ");
			}		
			System.out.println(" ");
		}
	}

	public static void substraction(int m,int n,int a[][],int b[][]){
		int d[][] = new int [m][n];
		  for(int i=0;i<m;i++){
			 for(int j=0;j<n;j++)	  
			    d[i][j]=a[i][j]-b[i][j];
		  }
	 		 for(int i=0;i<m;i++){
			 	for(int j=0;j<n;j++){	  
			   	 	System.out.print(d[i][j]+"  ");
			 	}
				System.out.println(" ");
	 		 }			
	}
	public static void multiplication(int m,int n,int o,int p,int a[][],int b[][]){
		 int sum=0;
	 	 int multiplication[][] = new int [m][p];
	 	 if(n==o){
			for(int i=0;i<m;i++){
				for(int j=0;j<p;j++){
			 		for(int k=0;k<o;k++){
						sum=sum+a[i][k]*b[k][j];
						multiplication[i][j]=sum;
					}
				sum=0;
				}
			}
		} else {
			System.out.println("Matrix Multiplication is not Possible");
		}
		for(int i=0;i<m;i++){
			for(int j=0;j<p;j++){
			 	System.out.print(multiplication[i][j]+"  "); 	
			}
			System.out.println(" ");		
		}	
	}
	public static void transpose(int m,int n,int a[][],int b[][])
	{
		int transpose[][]=new int[m][n];
		for (int i = 0; i < n; i++){
			for (int j = 0; j < m; j++)
			transpose[j][i] = a[i][j];
		}
		for(int i=0;i<m;i++){
			for(int j=0;j<n;j++){
			 	System.out.print(transpose[i][j]+"  ");
			}
			System.out.println(" ");		
		}
	}
	public static void main(String args[]){
		int m,n,o,p,sum=0;
		Scanner in = new Scanner(System.in);
		System.out.print("enter rows and columns of first matrix");
		m=in.nextInt();
		n=in.nextInt();
		System.out.print("enter rows and columns of second matrix");
		o=in.nextInt();
		p=in.nextInt();
		int transpose[][]=new int[m][n];
		int a [][] = new int [m][n];
 		int b [][] = new int [o][p];
 		int d [][] = new int [m][n];
		int multiplication[][] = new int [m][p];		
		System.out.print("Enter elements of first matrix");
              	 for(int i=0;i<m;i++){
              		 for(int j=0;j<n;j++) {		
              			 a[i][j]=in.nextInt();
              		 }
              	 }
              	 System.out.print("Enter elements of second matrix");
              	 for(int i=0;i<o;i++){
              		 for(int j=0;j<p;j++) {
              			 b[i][j]=in.nextInt();
              		 }
              	 }
		System.out.println("Addition is :");
		addition(m,n,a,b);
		System.out.println("Substraction is :");
		substraction(m,n,a,b);
		System.out.println("Multiplication is :");
		multiplication(m,n,o,p,a,b);
		System.out.println("Transpose is :");
		transpose(m,n,a,b);
    }
}	




						 	
