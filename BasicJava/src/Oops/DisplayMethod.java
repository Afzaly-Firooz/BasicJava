package Oops;

class DisplayThree {

	public void Disp() {
		System.out.println("-------inside of disply outside the main method");

	}

	public void show() {
		System.out.println("value : 20");
	}

}

public class DisplayMethod {

	public static void main(String[] args) {
		DisplayThree object = new DisplayThree();
		object.Disp();
		object.show();

	}

}
