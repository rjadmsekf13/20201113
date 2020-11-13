import java.util.Scanner;

/**
 * @PackageName		: 
 * @FileName		: NumberBb.java
 * @Since			: 2020. 8. 27
 * @Author			: KB
 * @Description		: 숫자야구 프로그램
 * =====================================================================================
 * 								   Modification History
 * =====================================================================================
 * Date				Author				Note
 * -------------------------------------------------------------------------------------
 * 2020. 8. 27		KB				최초 작성
 *
 */
public class NumberBb {
	
	final static int FIRST_ANSWER = 9;
	final static int SECOND_ANSWER = 6;
	final static int THIRD_ANSWER = 1;
	
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
		
		for (int i = 10; i > 0; i--) {
			System.out.println("총 " + i + "번의 기회가 남았습니다.");
			
			System.out.println("첫 번째 숫자 : ");
			int num1 = sc.nextInt();
			
			System.out.println("두 번째 숫자 : ");
			int num2 = sc.nextInt();
			
			System.out.println("세 번째 숫자 : ");
			int num3 = sc.nextInt();
			
			int strike = getStrikeCount(num1, num2, num3);
			int ball = getBallCount(num1, num2, num3);
			
			if (strike == 3) {
				System.out.println("정답입니다.");
				break;
			}
			
			System.out.println(strike + " Strike, " + ball + " ball 입니다.");
		}
		sc.close();
		return;
	}
	
	
	/**
	 * @MethodName		: getStrikeCount
	 * @Since			: 2020. 8. 24
	 * @author			: mwJung
	 * @Description		: 스트라이크 카운트를 계산한다.
	 *
	 * @param num1
	 * @param num2
	 * @param num3
	 * @return
	 *
	 */
	public static int getStrikeCount(int num1, int num2, int num3) {
		int strike = 0;
		if (num1 == FIRST_ANSWER) {
			strike++;
		}
		
		if (num2 == SECOND_ANSWER) {
			strike++;
		}
		
		if (num3 == THIRD_ANSWER) {
			strike++;
		}
		
		return strike;
	}
	
	/**
	 * @MethodName		: getBallCount
	 * @Since			: 2020. 8. 24
	 * @author			: mwJung
	 * @Description		: 볼 카운트를 계산한다.
	 *
	 * @param num1
	 * @param num2
	 * @param num3
	 * @return
	 *
	 */
	public static int getBallCount(int num1, int num2, int num3) {
		int ball = 0;
		if (num1 == SECOND_ANSWER || num1 == THIRD_ANSWER) {
			ball++;
		}
		
		if (num2 == FIRST_ANSWER || num2 == THIRD_ANSWER) {
			ball++;
		}
		
		if (num3 == FIRST_ANSWER || num3 == SECOND_ANSWER) {
			ball++;
		}
		
		return ball;
	}
}
