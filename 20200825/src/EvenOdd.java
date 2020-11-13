import java.util.Scanner;

/**
 * @PackageName		: 
 * @FileName		: EvenOdd.java
 * @Since			: 2020. 8. 25
 * @Author			: KB
 * @Description		: 
 * =====================================================================================
 * 								   Modification History
 * =====================================================================================
 * Date				Author				Note
 * -------------------------------------------------------------------------------------
 * 2020. 8. 25		KB				최초 작성
 *
 */
public class EvenOdd {

	/**
	 * @MethodName		: main
	 * @Since			: 2020. 8. 25
	 * @author			: KB
	 * @Description		: 
	 *
	 * @param args
	 *
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자 입력 : ");
		int num = sc.nextInt();
		
		if(num % 2 == 0) {
			System.out.println("even");
		}else if(num % 2 != 0) {
			System.out.println("odd");
		}
		
		sc.close();
		return;

	}

}
