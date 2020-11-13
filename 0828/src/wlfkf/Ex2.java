package wlfkf;

import java.util.Scanner;

/**
 * @PackageName : wlfkf
 * @FileName : Ex2.java
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
public class Ex2 {

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

		System.out.println("");
		int num1 = sc.nextInt();
		System.out.println("");
		int num2 = sc.nextInt();
		int result = 0;

		result = num1 * num2;

		System.out.println("답 : " + result);

	}

}
