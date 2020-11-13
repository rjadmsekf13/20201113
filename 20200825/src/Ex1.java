import java.util.Scanner;

/**
 * @PackageName		: 
 * @FileName		: Ex1.java
 * @Since			: 2020. 8. 25
 * @Author			: KB
 * @Description		: 시험점수 등급 매기는 프로그램
 * =====================================================================================
 * 								   Modification History
 * =====================================================================================
 * Date				Author				Note
 * -------------------------------------------------------------------------------------
 * 2020. 8. 25		KB				최초 작성
 *
 */
public class Ex1 {

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
		
		//입력 받는 부분
		Scanner sc = new Scanner(System.in);
		
		System.out.println("시험 점수 입력 : ");
		int score = sc.nextInt();
		
		String result = checkScore(score);
		System.out.println(result);
		
		sc.close();
		return;

	}
	
	public static String checkScore(int num) {
		if(num >= 90 && num <= 100){
			return 'A' + " 등급 입니다.";
		}else if(num >= 80 && num <= 89) {
			return 'B' + " 등급 입니다.";
		}else if(num >= 70 && num <= 79) {
			return 'C' + " 등급 입니다.";
		}else if(num >= 60 && num <= 69) {
			return 'D' + " 등급 입니다.";
		}else {
			return 'F' + " 등급 입니다.";
		}
	}

}
