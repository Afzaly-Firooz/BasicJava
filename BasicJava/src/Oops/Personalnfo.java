package Oops;

import java.util.Scanner;

public class Personalnfo {
	int id;
	int card;
	String name;
	String email;
	String phone;
	
	Scanner input = new Scanner(System.in);
	
	public void info() {
		System.out.println("Enter your id");
		id = input.nextInt();
		System.out.println("Enter your card");
		card = input.nextInt();
		System.out.println("Enter your name");
		name = input.next();
		System.out.println("Enter your Email");
		email = input.next();
		System.out.println("Enter your phone");
		phone = input.next();
		input.close();
		
		System.out.println("-----------------------");
		System.out.println("your Id card is " + id);
		System.out.println("your card is " + card);
		System.out.println("your name is " + name);
		System.out.println("your email is " + email);
		System.out.println("your phone number is " + phone);
		
		
	}
	
	
	

}
