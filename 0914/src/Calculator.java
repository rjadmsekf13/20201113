import java.util.Scanner;

/**
 * @PackageName :
 * @FileName : Calculator.java
 * @Since : 2020. 9. 14
 * @Author : KB
 * @Description :
 *              =====================================================================================
 *              Modification History
 *              =====================================================================================
 *              Date Author Note
 *              -------------------------------------------------------------------------------------
 *              2020. 9. 14 KB 최초 작성
 *
 */
public class Calculator {

	/**
	 * @MethodName : main
	 * @Since : 2020. 9. 14
	 * @author : KB
	 * @Description :
	 *
	 * @param args
	 *
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Calculation calculation = new Calculation();

		int num1 = 30;
		int num2 = 15;

		System.out.println("연산자(+,-,*,/) 입력 : ");
		String input = sc.next();

		switch (input) {
		case "+":
			System.out.println(num1 + " + " + num2 + " = " + calculation.add(num1, num2));
			break;
		case "-":
			System.out.println(num1 + " - " + num2 + " = " + calculation.subtract(num1, num2));
			break;
		case "*":
			System.out.println(num1 + " * " + num2 + " = " + calculation.multiply(num1, num2));
			break;
		case "/":
			System.out.println(num1 + " / " + num2 + " = " + calculation.divide(num1, num2));
			break;
		default:
			System.out.println("연산자 입력 오류 ");
			break;
		}

	}

}
