package volodymyr.task3.summ;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		
		summScan();
		
	}
	
	public static void summScan() {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter firts number");
		double first = scan.nextDouble();
		System.out.println("Enter second number");
		double second = scan.nextDouble();
		if(first % 1 == 0 && second % 1 == 0) {
			DecimalFormat df = new DecimalFormat("#");
			System.out.println("Summ 2 numbers = "+(df.format(first+second)));
		}else {
			System.out.println("Incorrectly entered data, please try again!");
		}
	}
	
}
