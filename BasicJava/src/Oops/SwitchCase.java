package Oops;

public class SwitchCase {

	public static void main(String[] args) {

		int num1 = 27;
		int num2 = 34;
		int Case = 4;
		switch(Case) 
		{
		case 1:
			int result1 = num1-num2;
			System.out.println("result for subtraction is : " + result1);
			break;
			case 2:
			int result2 = num1 + num2;
			System.out.println("result for addition is :" + result2);
			break;
			case 3:
				int result3 = num1 * num2;
				System.out.println("result for  multiplication is :" + result3);
				break;
				case 4:
					int result4 = num2 / num1;
					System.out.println("result for addition is : " + result4);
					break;
		}
	}

}
