import java.util.Scanner;

/**
 * @PackageName		: 
 * @FileName		: MethodDevide.java
 * @Since			: 2020. 8. 27
 * @Author			: KB
 * @Description		: 메소드를 이용한 입력받은 두 수의 나누기
 * =====================================================================================
 * 								   Modification History
 * =====================================================================================
 * Date				Author				Note
 * -------------------------------------------------------------------------------------
 * 2020. 8. 27		KB				최초 작성
 *
 */
public class MethodDevide {

	/**
	 * @MethodName		: main
	 * @Since			: 2020. 8. 27
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
		int num1 = sc.nextInt();
		System.out.println("숫자 입력 : ");
		int num2 = sc.nextInt();
		
		int result = devide(num1, num2);
		
		System.out.println("값 : " + result);

	}
	
	public static int devide(int z, int x) {
		return z / x;
	}

}
