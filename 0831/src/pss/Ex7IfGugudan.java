package pss;

/**
 * @PackageName : pss
 * @FileName : Ex7IfGugudan.java
 * @Since : 2020. 8. 31
 * @Author : KB
 * @Description : 짝수단 중 곱해지는 수가 홀수인단
 *              =====================================================================================
 *              Modification History
 *              =====================================================================================
 *              Date Author Note
 *              -------------------------------------------------------------------------------------
 *              2020. 8. 31 KB 최초 작성
 *
 */
public class Ex7IfGugudan {

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
				// 짝수단에서 곱해지는 수가 홀수인 단을 검출하는 if 문
				if (i % 2 == 0 && z % 2 != 0) {
					System.out.println(i + " x " + z + " = " + i * z);
				}
			}
		}

	}

}
