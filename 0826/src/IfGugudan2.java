
/**
 * @PackageName		: 
 * @FileName		: IfGugudan2.java
 * @Since			: 2020. 8. 26
 * @Author			: KB
 * @Description		: 홀수구구단중 곱해지는수가 짝수인것을 출력하는 코드 작성
 * =====================================================================================
 * 								   Modification History
 * =====================================================================================
 * Date				Author				Note
 * -------------------------------------------------------------------------------------
 * 2020. 8. 26		KB				최초 작성
 *
 */
public class IfGugudan2 {

	/**
	 * @MethodName		: main
	 * @Since			: 2020. 8. 26
	 * @author			: KB
	 * @Description		: 
	 *
	 * @param args
	 *
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 2; i <= 9; i++) {
			for(int z = 1; z <= 9; z++) {
				if((i % 2) != 0  && (z % 2) == 0)
			System.out.println(i + " * " + z + " = " + (i * z));
			}
		}

	}

}
