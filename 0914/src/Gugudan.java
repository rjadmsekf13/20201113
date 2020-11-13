
/**
 * @PackageName :
 * @FileName : Gugudan.java
 * @Since : 2020. 9. 14
 * @Author : KB
 * @Description :
 *              =====================================================================================
 *              Modification History
 *              =====================================================================================
 *              Date Author Note
 *              -------------------------------------------------------------------------------------
 *              2020. 9. 14 KB 최초 작성
 *
 */
public class Gugudan {

	/**
	 * @MethodName : main
	 * @Since : 2020. 9. 14
	 * @author : KB
	 * @Description :
	 *
	 * @param args
	 *
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 0;
		int j = 0;

		for (i = 2; i <= 9; i++) {
			for (j = 1; j <= 9; j++) {
				System.out.println(i + " x " + j + " = " + (i * j));
			}
		}
	}

}
