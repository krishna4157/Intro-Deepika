import java.util.Scanner;
class ChartoString {	
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
			String y = new String(b);
			System.out.println(" String is :"+y);
		}
}