package Oops;

class Display{
	String name = "Ali";
	int age = 25;
	String address = "california";
}

public class FirstProgram {

	public static void main(String[] args) {
		Display show = new Display();
		System.out.println(show.name);
		System.out.println( show.age);
		System.out.println(show.address);
		
	}

}
