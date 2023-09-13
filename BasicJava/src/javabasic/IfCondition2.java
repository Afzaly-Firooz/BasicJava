package javabasic;

public class IfCondition2 {

	public static void main(String[] args) {

		int age = 9;
		if (age >= 20 && age <=35) {
			System.out.println("you are eligible to vote");
		} else if (age >=15 && age <=19) {
			System.out.println("you are not eligible to vote");
		} else if (age >=10 && age <=14) {
			System.out.println("you are still not eligible to vote");
		} else {
			System.out.println("Hey you are not eligible to vote at all");
		}
	}
}

