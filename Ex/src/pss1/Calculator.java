package pss1;
import java.util.Scanner;

/**
 * @PackageName		: 
 * @FileName		: Calculator.java
 * @Since			: 2020. 9. 28
 * @Author			: KB
 * @Description		: 
 * =====================================================================================
 * 								   Modification History
 * =====================================================================================
 * Date				Author				Note
 * -------------------------------------------------------------------------------------
 * 2020. 9. 28		KB				최초 작성
 *
 */
public class Calculator {

	/**
	 * @MethodName		: main
	 * @Since			: 2020. 9. 28
	 * @author			: KB
	 * @Description		: 
	 *
	 * @param args
	 *
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calcul calcul = new Calcul();
		int num1 = 10;
		int nun2 = 2;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("연산자 : ");
		String figure = sc.next();
		
		switch (figure) {
		case "+":
			System.out.println(calcul.add(num1, num1));
			break;
		case "-":
			System.out.println(calcul.stt(num1, num1));
			break;
		case "*":
			System.out.println(calcul.mpy(num1, num1));
			break;
		case "/":
			System.out.println(calcul.dvd(num1, num1));
			break;
		default:
			System.out.println("연산자 오류");
			break;
		}

	}

}
