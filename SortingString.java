import java.util.Scanner;
class SortingString {	
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter number of Strings in Array :");
			int l=sc.nextInt();
			//System.out.println("Enter String");
			//String a= sc.next();
			String [] b = new String[l];
			//char [] c = new char[a.length()];
			for(int i=0;i<l;i++){
				b[i]=sc.next();
			}
			//String y = new String(b);
			for(int i=0;i<l;i++) {
				for(int j=i+1;j<l;j++) {
					if((b[i].compareTo(b[j])>0)){
						String temp = b[i];
						b[i]=b[j];
						b[j]=temp;
					}
				}
			}
			System.out.println("the sorted String elements in Array is :");
			for(int i=0;i<l;i++) {
				System.out.print(b[i]+",");
			}
			//String y = new String(b);
			//System.out.println(" String is :"+y);
		}
}