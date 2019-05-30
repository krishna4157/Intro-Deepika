import java.util.Scanner;
class BattingAverage {
        public static void main(String arg[]) {
	        Scanner in = new Scanner(System.in);
	        System.out.println("Enter Total Runs");
	        int totalruns=in.nextInt();
	        System.out.println("Enter Innings");
	        float Innings=in.nextFloat();
	        System.out.println("Enter Number of Not outs");
	        int notouts=in.nextInt();
	        float avg;
	        avg = totalruns / (Innings - notouts);
	        System.out.println("batting average = " + avg);
        }
}
