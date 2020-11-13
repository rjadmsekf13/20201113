import java.util.Scanner;

/**
 * @PackageName		: 
 * @FileName		: ScannerEx.java
 * @Since			: 2020. 8. 25
 * @Author			: KB
 * @Description		: scanner를 이용한 두수를 비교하여 큰수를 출력
 * =====================================================================================
 * 								   Modification History
 * =====================================================================================
 * Date				Author				Note
 * -------------------------------------------------------------------------------------
 * 2020. 8. 25		KB				최초 작성
 *
 */
public class ScannerEx {

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
		
		System.out.println("첫 번째 숫자 입력 : ");
		int num1 = sc.nextInt();
		System.out.println("두 번째 숫자 입력 : ");
		int num2 = sc.nextInt();
		
		String result = checkNumber(num1, num2);
		System.out.println(result);		
		
		sc.close();
		return;
	}

		public static String checkNumber(int z, int x) {
			if(z > x) {
				return "첫 번째 숫자가 더 큼";
			}else if(z < x) {
				return "두 번째 숫자가 더 큼";
			}else{
				return "두수가 같음";
			}			 
		}

}


