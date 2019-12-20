package volodymyr.task2.total;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
	
		totalScan();
		
	}
	
	public static void totalScan() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number :");
		
		//String number = sc.next();
		Double number = sc.nextDouble();
		if(number % 2 == 0 & number % 1 == 0){
			System.out.println("Pair");
		}else if(number % 2 == 1 & number % 1 == 0) {
			System.out.println("Unpair");
		}else{
			System.out.println("Incorrectly entered data, please try again!");
		}
	}
	
}
