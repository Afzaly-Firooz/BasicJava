package javabasic;
import java.util.*;
public class ScannerClass {

	public static void main(String[] args) {
		int startpoint;
		int endpoint;
		Scanner read = new Scanner(System.in);
		System.out.println("enter your startpoint");
		startpoint = read.nextInt();
		System.out.println("enter your endpont");
		endpoint = read.nextInt();
		for(;startpoint <= endpoint; startpoint++) {
			System.out.println(startpoint);
		}
	}

}
