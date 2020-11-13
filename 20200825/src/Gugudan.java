
/**
 * @PackageName		: 
 * @FileName		: Gugudan.java
 * @Since			: 2020. 8. 25
 * @Author			: KB
 * @Description		: for문을 이용한 구구단 출력
 * =====================================================================================
 * 								   Modification History
 * =====================================================================================
 * Date				Author				Note
 * -------------------------------------------------------------------------------------
 * 2020. 8. 25		KB				최초 작성
 *
 */
public class Gugudan {

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
		
		for(int i = 2; i <= 9; i++) {
			for(int z = 1; z <= 9; z++) {
			System.out.println(i + " * " + z + " = " + (i * z));
			}
		}
	}

}