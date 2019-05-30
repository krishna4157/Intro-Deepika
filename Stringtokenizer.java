import java.util.*;
import java.lang.*;
class Stringtokenizer{
	public static void main(String[] args) {
    String s = "one two three four five six seven eight nine ten eleven twelve thirteen";
	
    StringTokenizer st = new StringTokenizer(s);
		
    System.out.println("The string has " + st.countTokens() + " word" + (st.countTokens()>1?"s":"") + "!");
    st.nextToken();
    st.nextToken();
    System.out.println("The third word is " + st.nextToken());
		
    st = new StringTokenizer(s);
		
    System.out.println("\nEvery third words are :");
    String temp;
    int i = 1;
    while( st.hasMoreTokens() ){
        temp=st.nextToken();
    	if(i%4==0) {
        	System.out.println(temp);
        }
        i++;
    }
}
}