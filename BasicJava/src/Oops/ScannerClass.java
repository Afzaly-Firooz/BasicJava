package Oops;
import java.util.Scanner;
public class ScannerClass {

	public static void main(String[] args) {

		int startpoint;
		int endpoint;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your startpoint?");
		startpoint = input.nextInt();
		
		System.out.println("Enter your endpoint?");
		endpoint = input.nextInt();
		for(; startpoint<=endpoint;startpoint++) {
			System.out.println(startpoint);
			
		}
	}

}
