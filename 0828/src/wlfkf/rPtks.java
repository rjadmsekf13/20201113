package wlfkf;

import java.util.Scanner;

/**
 * @PackageName : wlfkf
 * @FileName : rPtks.java
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
public class rPtks {

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
		System.out.println("기호 : ");
		String f = sc.next();
		System.out.println("숫자 : ");
		int num2 = sc.nextInt();

		switch (f) {
		case "+":
			System.out.println("답 : " + (num1 + num2));
			break;
		case "-":
			System.out.println("답 : " + (num1 - num2));
			break;
		case "*":
			System.out.println("답 : " + (num1 * num2));
			break;
		case "/":
			System.out.println("답 : " + (num1 / num2));
			break;
		default:
			System.out.println("연산 기호 오류");
			break;
		}

	}

}
