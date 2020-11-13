package pss;

/**
 * @PackageName : pss
 * @FileName : Ex10831.java
 * @Since : 2020. 8. 31
 * @Author : KB
 * @Description : 구구단 3단출력
 *              =====================================================================================
 *              Modification History
 *              =====================================================================================
 *              Date Author Note
 *              -------------------------------------------------------------------------------------
 *              2020. 8. 31 KB 최초 작성
 *
 */
public class Ex10831 {

	/**
	 * @MethodName : main
	 * @Since : 2020. 8. 31
	 * @author : KB
	 * @Description :
	 *
	 * @param args
	 *
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 구구단 3단 고정
		int num = 3;

		for (int i = 1; i <= 9; i++) {
			int result = num * i;

			System.out.println(num + " x " + i + " = " + result);
		}
	}

}
