package ex3;

import java.util.Scanner;

/**
 * @PackageName		: ex3
 * @FileName		: dirtn.java
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
public class dirtn {

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
		System.out.println("숫자입력 : ");
		int num = sc.nextInt();
		
		for(int i= 1; i <= num; i++) {
			if(num % i == 0) {
				System.out.println(i);
			}
		}

	}

}
