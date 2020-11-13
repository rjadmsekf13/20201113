import java.util.Scanner;

/**
 * @PackageName		: 
 * @FileName		: Calculator.java
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
public class Calculator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자 : ");
		int num1 = sc.nextInt();
		System.out.println("연산자 : ");
		String figure = sc.next();
		System.out.println("숫자 : ");
		int num2 = sc.nextInt();
		
		switch(figure) {
		case "+":
			System.out.println(num1 + num2);
			break;
		case "-":
			System.out.println(num1 - num2);
			break;
		case "*":
			System.out.println(num1 * num2);
			break;
		case "/":
			System.out.println(num1 / num2);
			break;
		default:
			System.out.println("연산자를 잘못 입력하였습니다.");
			break;
		}
	}

}
