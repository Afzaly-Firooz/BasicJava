package Oops;

import java.util.Scanner;

public class DynoArray {

	public static void main(String[] args) {
		int size, i;
		Scanner read = new Scanner(System.in);
		System.out.println("Enter size of an Array");
		size = read.nextInt();

		int number[] = new int[size];

		System.out.println("Enter " + size + "size of an Array");
		for (i = 0; i < number.length; i++) {
			number[i] = read.nextInt();

		}
		System.out.println("================Array Elenents");
		for (i = 0; i < number.length; i++) {
			System.out.println(number[i]);
		}
	}

}
