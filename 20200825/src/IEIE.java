
/**
 * @PackageName		: 
 * @FileName		: IEIE.java
 * @Since			: 2020. 8. 25
 * @Author			: KB
 * @Description		: if ~ else if문 연습
 * =====================================================================================
 * 								   Modification History
 * =====================================================================================
 * Date				Author				Note
 * -------------------------------------------------------------------------------------
 * 2020. 8. 25		KB				최초 작성
 *
 */
public class IEIE {

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
		
		int num = 120;
		
		if(num < 0) {
			System.out.println("0 미만");
		}else if(num < 100) {
			System.out.println("0 이상 100 미만");
		}else {
			System.out.println("100 이상");
		}

	}

}
