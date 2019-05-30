import java.util.Scanner;
class Sortingchar {	
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter number of characters in String");
			int l=sc.nextInt();
			//System.out.println("Enter String");
			//String a= sc.next();
			char [] b = new char[l];
			//char [] c = new char[a.length()];
			for(int i=0;i<l;i++){
				b[i]=sc.next().charAt(0);
			}
			//String y = new String(b);
			for(int i=0;i<l;i++) {
				for(int j=i+1;j<l;j++) {
					if(b[i]>b[j]){
						char temp = b[i];
						b[i]=b[j];
						b[j]=temp;
					}
				}
			}
			System.out.println("the sorted characters in string is :");
			for(int i=0;i<l;i++) {
				System.out.print(b[i]);
			}
			//String y = new String(b);
			//System.out.println(" String is :"+y);
		}
}