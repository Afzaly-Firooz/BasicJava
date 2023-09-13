package inheritance;

class employee {
	int HRsalary = 400;
	int FSalary = 5000;
	int DevSalary = 8000;
}

class HR extends employee {
	String name = "Ali";
}

class finance extends employee {
	String FName = "jan";
}

public class BasicInheritance {

	public static void main(String[] args) {

		HR show = new HR();
		System.out.println("Name of HR :" + show.name);
		System.out.println("Name of HR : " + show.HRsalary);

		finance disp = new finance();
		System.out.println("Name of the finance :" + disp.FName);
		System.out.println("salary of the finance :" + disp.FSalary);
	}

}
