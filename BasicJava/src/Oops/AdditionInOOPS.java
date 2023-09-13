package Oops;

class Addition{
	int firstNumbr = 12;
	int secondNumber = 45;
	int total = firstNumbr + secondNumber;
}

public class AdditionInOOPS {

	public static void main(String[] args) {
		 Addition result = new Addition();
		 System.out.println(result.firstNumbr);
		 System.out.println(result.secondNumber);
		 System.out.println("addition of two number is" + " "+ result.total);
	}

}
