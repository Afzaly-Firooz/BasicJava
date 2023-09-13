package inheritance;

class animal{
	void eat() {
		System.out.println("they  can eat");
	}
	void run() {
		System.out.println("The can run");
	}
}
class dog extends animal{
	void bark() {
		System.out.println("Dog is barking");
	}
}
class cat extends animal{
	void meyeow() {
		System.out.println("cat is doing meyeow");
	}
}

public class HerichalInheritance {

	public static void main(String[] args) {
		dog disp = new dog();
		disp.bark();
		disp.eat();
		disp.run();
		cat showCat = new cat();
		showCat.meyeow();
		showCat.run();
		showCat.eat();
		
		
	}

}
