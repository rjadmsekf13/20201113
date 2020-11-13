package wlfkf;

import java.util.Scanner;

/**
 * @PackageName		: wlfkf
 * @FileName		: Ex8.java
 * @Since			: 2020. 8. 28
 * @Author			: KB
 * @Description		: 
 * =====================================================================================
 * 								   Modification History
 * =====================================================================================
 * Date				Author				Note
 * -------------------------------------------------------------------------------------
 * 2020. 8. 28		KB				최초 작성
 *
 */
public class Ex8 {

	/**
	 * @MethodName		: main
	 * @Since			: 2020. 8. 28
	 * @author			: KB
	 * @Description		: 
	 *
	 * @param args
	 *
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("점수 : ");
		int num1 = sc.nextInt();
		System.out.println("점수 : ");
		int num2 = sc.nextInt();
		System.out.println("점수 : ");
		int num3 = sc.nextInt();
		System.out.println("점수 : ");
		int num4 = sc.nextInt();
		System.out.println("점수 : ");
		int num5 = sc.nextInt();
		int result = 0;
		
		if(result >= 90 && result <= 100) {
			System.out.println("A 등급");
		}else if(result >= 80 && result <= 89) {
			System.out.println("B 등급");
		}else if(result >= 70 && result <= 79) {
			System.out.println("C 등급");
		}else {
			System.out.println("D 등급");
		}


	}

}
