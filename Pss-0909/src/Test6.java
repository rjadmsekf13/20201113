
/**
 * @PackageName :
 * @FileName : Test6.java
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
public class Test6 {

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

		// 1000 까지의 정수중 소수 합계 출력

		int sum = 0;
		for (int i = 2; i <= 1000; i++) {
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					break;
				}
			}
			sum += i;
		}
		System.out.println(sum);
	}

	public static boolean isSosu(int num) {

		return true;
	}

}
