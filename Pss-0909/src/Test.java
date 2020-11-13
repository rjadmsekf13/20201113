
/**
 * @PackageName :
 * @FileName : test.java
 * @Since : 2020. 9. 9
 * @Author : KB
 * @Description :
 *              =====================================================================================
 *              Modification History
 *              =====================================================================================
 *              Date Author Note
 *              -------------------------------------------------------------------------------------
 *              2020. 9. 9 KB 최초 작성
 *
 */
public class Test {

	/**
	 * @MethodName : main
	 * @Since : 2020. 9. 9
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
		// 구구단
//		for (i = 2; i <= 9; i++) {
//			for (j = 1; j <= 9; j++) {
//				System.out.println(i + " x " + j + " = " + i * j);
//			}
//		}
		// 짝수 구구단
		for (i = 2; i <= 9; i++) {
			for (j = 1; j <= 9; j++) {
				if (i % 2 == 0) {
					System.out.println(i + " x " + j + " = " + i * j);
				}
			}
		}
	}

}
