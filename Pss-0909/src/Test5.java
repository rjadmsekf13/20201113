
/**
 * @PackageName :
 * @FileName : Test5.java
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
public class Test5 {

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

		// 1000000 까지의 정수중 7의 배수 합계 출력

		long num2 = 0;

		for (long num1 = 1; num1 <= 1000000; num1++) {
			if (num1 % 7 == 0) {
				num2 += num1;
			}
		}
		System.out.println(num2);

	}

}
