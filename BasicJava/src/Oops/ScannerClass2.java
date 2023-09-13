package Oops;
import java.util.Scanner;
public class ScannerClass2 {

	public static void main(String[] args) {

		Scanner read = new Scanner(System.in);
		System.out.println("Enter your firstNumber?");
		 int firstNumber = read.nextInt();
		 
		 System.out.println("Enter your secondNumber?");
		 int secondNumber = read.nextInt();
		 
		 System.out.println("Total result is " + firstNumber + secondNumber);
	}

}
