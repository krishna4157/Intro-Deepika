import java.util.Scanner;
class DistanceBetweenPoints{
	public static void main(String arg[]){
           	int x1,x2,y1,y2;
           	double dis;	
           	Scanner sc=new Scanner(System.in);
           	System.out.println("enter x1 point");
                x1=sc.nextInt();
            System.out.println("enter y1 point");
            	y1=sc.nextInt();
            System.out.println("enter x2point");
                x2=sc.nextInt();
            System.out.println("enter y2 point");
                y2=sc.nextInt();
                dis=Math.sqrt(Math.pow(x2-x1,2) + Math.pow(y2-y1,2)); 	    
                System.out.println("distancebetween"+"("+x1+","+y1+"),"+"("+x2+","+y2+") is :"+dis);
	}
}