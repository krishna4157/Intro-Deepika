    import java.util.Scanner;
    class LCMandHCF { 
    	public static void main(String args[]) {
    		int a, b, x, y, t, hcf, lcm;
    		Scanner scan = new Scanner(System.in);
    		System.out.print("Enter Two Number : ");
    		x = scan.nextInt();
    		y = scan.nextInt();
    		a = x;
    		b = y;
    		while (b != 0){
    			t = b;
    			b = a % b;
    			a = t;
    		}
    		hcf = a;
    		lcm = (x * y) / hcf;
    		System.out.println("HCF = " +hcf);
    		System.out.println("LCM = " +lcm);
    	}
    }