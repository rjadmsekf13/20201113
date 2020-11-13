package calculator;

import java.util.Scanner;

import calculator.Add;
import calculator.Stt;
import calculator.Mpy;
import calculator.Dvd;

/**
 * @PackageName : calculator
 * @FileName : Calculator.java
 * @Since : 2020. 8. 28
 * @Author : KB
 * @Description :
 *              =====================================================================================
 *              Modification History
 *              =====================================================================================
 *              Date Author Note
 *              -------------------------------------------------------------------------------------
 *              2020. 8. 28 KB 최초 작성
 *
 */
public class Calculator {

	/**
	 * @MethodName : main
	 * @Since : 2020. 8. 28
	 * @author : KB
	 * @Description :
	 *
	 * @param args
	 *
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("숫자 : ");
		int num1 = sc.nextInt();
		System.out.println("연산자 : ");
		String figure = sc.next();
		System.out.println("숫자 : ");
		int num2 = sc.nextInt();
		int result = 0;

		switch (figure) {
		case "+":
			Add add = new Add();
			add.add(num1, num2);
			result = add.add(num1, num2);
			break;
		case "-":
			Stt stt = new Stt();
			stt.stt(num1, num2);
			result = stt.stt(num1, num2);
			break;
		case "*":
			Mpy mpy = new Mpy();
			mpy.mpy(num1, num2);
			result = mpy.mpy(num1, num2);
			break;
		case "/":
			Dvd dvd = new Dvd();
			dvd.dvd(num1, num2);
			result = dvd.dvd(num1, num2);
			break;
		default:
			System.out.println("연산자 오류");
			return;
		}
		System.out.println("답 : " + result);
		return;
	}
}
