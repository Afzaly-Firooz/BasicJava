package Oops;

class information {
	String firstname = "firooz";
	String lastName = "afzaly";
	int age = 37;
	String middleName = "af";

}

public class PersonalInformation {

	public static void main(String[] args) {
		information info = new information();
		System.out.println(info.firstname);
		System.out.println(info.lastName);
		System.out.println(info.age);
		System.out.println(info.middleName);
	}

}
