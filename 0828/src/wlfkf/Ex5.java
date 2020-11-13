package wlfkf;

import java.util.Scanner;

/**
 * @PackageName : wlfkf
 * @FileName : Ex5.java
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
public class Ex5 {

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
		int num = sc.nextInt();

		if (num % 2 == 0) {
			System.out.println("짝수입니다.");
		} else if (num % 2 != 0) {
			System.out.println("홀수입니다.");
		}

	}

}
