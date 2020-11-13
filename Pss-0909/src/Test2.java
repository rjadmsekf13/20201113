
/**
 * @PackageName :
 * @FileName : Test2.java
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
public class Test2 {

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
		
		// 1 에서 1000 까지 합계 구하기
		
		int num1 = 1;
		int num2 = 0;

		for (num1 = 1; num1 <= 1000; num1++) {
			num2 += num1;
		}
		System.out.println(num2);
	}

}
