
/**
 * @PackageName :
 * @FileName : Test3.java
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
public class Test3 {

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

		// 1 에서 100 까지 중 짝수 합계 구하기

		int num1 = 1;
		int num2 = 0;

		for (num1 = 1; num1 <= 100; num1++) {
			if (num1 % 2 == 0) {
				num2 += num1;
			}
		}
		System.out.println(num2);

	}

}
