package inheritance;

class father{
	public void eat() {
		System.out.println("he is Eating");
	}
	 public void walking() {
		System.out.println("He is walking");
	}
}
 class son extends father{
	 void usingsmartphone() {
		 System.out.println("he is using smart phone");
	 }
 }

public class SingleInheritance {

	public static void main(String[] args) {
		son show = new son();
		show.eat();
		show.usingsmartphone();
		show.walking();

	}

}
