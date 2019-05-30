import java.util.Scanner;
class ReverseString {	
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			int n=0;
			System.out.println("Enter String");
			String a= sc.next();
			char [] b = new char[a.length()];
			char [] c = new char[a.length()];
			for(int i=0;i<a.length();i++) {	
				b[i]=a.charAt(i);
			}
			for(int i=a.length()-1;i>-1;i--){
				c[n]=b[i];
				n++;
			}
			String y = new String(c);
			System.out.println("Reverse of String is :"+y);
		}
}
			/*for(int j=0;j<a.length();j++) {
							}
	}*/
