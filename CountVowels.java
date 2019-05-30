import java.util.Scanner;
class CountVowels {
	public static void main(String[] args) {
		String s;
		int count=0;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter String :");
		s=in.next();
		int l=s.length();
		char c[]=new char[l];
		for(int i=0;i<l;i++) {
			c[i]=s.charAt(i);
		}
			System.out.println("Entered String is :");
		for(int i=0;i<l;i++) {
			System.out.print(c[i]);
		}
		System.out.println(" ");
		for(int i=0;i<l;i++) {
			switch(c[i]){
			 case 'a'  :
				 count++;
				 break;
			 case 'e'  :
				 count++;
				 break;
			 case 'i'  :
				 count++;
				 break;
			 case 'o'  :
				 count++;
				 break;
			 case 'u'  :
				 count++;
				 break;
			 case 'A'  :
				 count++;
				 break;
			 case 'E'  :
				 count++;
				 break;
			 case 'I'  :
				 count++;
				 break;
			 case 'O'  :
				 count++;
				 break;
			 case 'U'  :
				 count++;
				 break;
			}
		}
		if(count>0) {
			System.out.println("The total Number of Vowels in String are "+count);
		}
		else {
			System.out.println("no vowels are present in the string");
		}
	}	
}
