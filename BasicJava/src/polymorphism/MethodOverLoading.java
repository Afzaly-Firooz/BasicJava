package polymorphism;

class Addition {
	public void add(int a, int b) {
		System.out.println(a + b);
	}

	public void add(int a, int b, int c) {
		System.out.println(a + b + c);
	}
}

public class MethodOverLoading {

	public static void main(String[] args) {
		Addition ops = new Addition();
		ops.add(20, 10);
	}

}
