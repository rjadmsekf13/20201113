package ex2;

import java.util.Scanner;

/**
 * @PackageName		: ex2
 * @FileName		: Calculator.java
 * @Since			: 2020. 9. 29
 * @Author			: KB
 * @Description		: 
 * =====================================================================================
 * 								   Modification History
 * =====================================================================================
 * Date				Author				Note
 * -------------------------------------------------------------------------------------
 * 2020. 9. 29		KB				최초 작성
 *
 */
public class Calculator {

	/**
	 * @MethodName		: main
	 * @Since			: 2020. 9. 29
	 * @author			: KB
	 * @Description		: 
	 *
	 * @param args
	 *
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Calculation calculation = new Calculation();
		
		int num1 = 15;
		int num2 = 3;
		
		System.out.println("연산자 입력 : ");
		String figure = sc.next();
		
		switch (figure) {
		case "+":
			System.out.println(calculation.Add(num1, num2));
			break;
		case "-":
			System.out.println(calculation.Sub(num1, num2));
			break;
		case "*":
			System.out.println(calculation.Mpy(num1, num2));
			break;
		case "/":
			System.out.println(calculation.Dvd(num1, num2));
			break;

		default:
			System.out.println("연산자 입력 오류 ");
			break;
		}

	}

}
