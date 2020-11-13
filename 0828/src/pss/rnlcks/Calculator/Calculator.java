package pss.rnlcks.Calculator;

import java.util.Scanner;

/**
 * @PackageName :
 * @FileName : Calculator.java
 * @Since : 2020. 8. 25
 * @Author : KB
 * @Description :
 *              =====================================================================================
 *              Modification History
 *              =====================================================================================
 *              Date Author Note
 *              -------------------------------------------------------------------------------------
 *              2020. 8. 25 KB 최초 작성
 *
 */
public class Calculator {
	public static void main(String[] args) {

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
			result = add(num1, num2);
			break;
		case "-":
			result = Stt(num1, num2);
			break;
		case "*":
			result = Mpy(num1, num2);
			break;
		case "/":
			result = Dvd(num1, num2);
			break;
		default:
			System.out.println("연산자 오류");
			break;
		}

		System.out.println(result);

	}// 더하기

	public static int add(int z, int x) {
		return z + x;
	}// 빼기

	public static int Stt(int z, int x) {
		return z - x;
	}// 곱하기

	public static int Mpy(int z, int x) {
		return z * x;
	}// 나누기

	public static int Dvd(int z, int x) {
		return z / x;
	}
}
