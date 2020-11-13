package pss;

/**
 * @PackageName : pss
 * @FileName : Ex6ifGugudan3.java
 * @Since : 2020. 8. 31
 * @Author : KB
 * @Description : 곱해지는 수가 짝수인 구구단
 *              =====================================================================================
 *              Modification History
 *              =====================================================================================
 *              Date Author Note
 *              -------------------------------------------------------------------------------------
 *              2020. 8. 31 KB 최초 작성
 *
 */
public class Ex6ifGugudan3 {

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

		for (int i = 2; i <= 9; i++) {
			for (int z = 1; z <= 9; z++) {
				if (z % 2 == 0) {
					System.out.println(i + " x " + z + " = " + i * z);
				}
			}
		}

	}

}
