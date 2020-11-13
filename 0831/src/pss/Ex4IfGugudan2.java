package pss;

/**
 * @PackageName		: pss
 * @FileName		: Ex4IfGugudan2.java
 * @Since			: 2020. 8. 31
 * @Author			: KB
 * @Description		: 홀수단출력
 * =====================================================================================
 * 								   Modification History
 * =====================================================================================
 * Date				Author				Note
 * -------------------------------------------------------------------------------------
 * 2020. 8. 31		KB				최초 작성
 *
 */
public class Ex4IfGugudan2 {

	/**
	 * @MethodName		: main
	 * @Since			: 2020. 8. 31
	 * @author			: KB
	 * @Description		: 
	 *
	 * @param args
	 *
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for (int i = 2; i <= 9; i++) {
			for (int z = 1; z <= 9; z++) {
				if (i % 2 != 0) {
					System.out.println(i + " x " + z + " = " + i * z);
				}
			}
		}

	}

}
