package Oops;

abstract class toyota {
	abstract void example();
}

class corolla extends toyota {
	// this is abstract class.

	void example() {
		System.out.println("this is my new calss");

	}
}

class camery extends toyota {
	void example() {
		System.out.println("this is another new class");

	}

}

public class AbstractExample {

	public static void main(String[] args) {
		toyota car = new corolla();
		car.example();
		toyota s = new camery();
		s.example();

	}

}
